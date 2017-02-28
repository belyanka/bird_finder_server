package com.birb;

import com.birb.domain.BirdDescriptionEntity;
import com.birb.repositories.BirdDescriptionRepository;
import com.birb.repositories.BirdSearchRepository;
import java.util.HashMap;
import java.util.List;

public class Birder implements DataConnection{

    private BirdDescriptionRepository birdRep;
    private BirdSearchRepository searchRep;

    @Override
    public List<BirdDescriptionEntity> searchBird(HashMap<String, String> searchParameters) {
        return null;
    }

    @Override
    public List<BirdDescriptionEntity> getBirdsList() {
        return null;
    }

    @Override
    public BirdDescriptionEntity getBirdByName() {
        return null;
    }

    @Override
    public List<BirdDescriptionEntity> getBirdListByTaxonomy() {
        return null;
    }
}
