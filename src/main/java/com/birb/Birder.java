package com.birb;

import com.birb.domain.BirdCriteria;
import com.birb.domain.BirdDescriptionEntity;
import com.birb.domain.BirdSearchEntity;
import com.birb.services.BirdDescriptionService;
import com.birb.services.BirdSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class Birder {

    @Autowired
    private BirdSearchService searchService;
    @Autowired
    private BirdDescriptionService birdService;

    public List<BirdDescriptionEntity> searchBird(HashMap<String, String> searchParameters) {

        BirdCriteria originalCriteria = new BirdCriteria();
        for(Map.Entry<String, String> entry: searchParameters.entrySet()){
            originalCriteria.setField(entry.getKey(),entry.getValue());
        }

        BirdCriteria criteria = new BirdCriteria();

        List<String> searchKeys = new ArrayList<>(searchParameters.keySet());

        searchKeys.retainAll(Config.firstImportance);

        if(searchKeys.isEmpty()){
            //todo: use second importance list
        }
        for (String key: searchKeys){
            criteria.setField(key,searchParameters.get(key));
        }

        //сортировка и отсеивание по релевантности
        List<BirdSearchEntity> searches = Relevance.setRelevanceOrder(searchService.getSearchEntitiesByParams(criteria), originalCriteria);
        //List<BirdSearchEntity> searches = searchService.getSearchEntitiesByParams(criteria);
        List<Integer> ids = searches.stream().map(BirdSearchEntity::getSpId).collect(Collectors.toList());

        return birdService.getBirdsByIds(ids);
    }

    public List<BirdDescriptionEntity> getBirdsList() {
        return null;
    }

    public BirdDescriptionEntity getBirdByName() {
        return null;
    }

    public List<BirdDescriptionEntity> getBirdListByTaxonomy() {
        return null;
    }
}
