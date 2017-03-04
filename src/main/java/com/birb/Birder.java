package com.birb;

import com.birb.domain.BirdCriteria;
import com.birb.domain.BirdDescriptionEntity;
import com.birb.domain.BirdSearchEntity;
import com.birb.services.BirdSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class Birder implements DataConnection {

    @Autowired
    private BirdSearchService service;

    @Override
    public List<BirdDescriptionEntity> searchBird(HashMap<String, String> searchParameters) {

        BirdCriteria criteria = new BirdCriteria();
        if(searchParameters.get("body_type")!=null){
            criteria.setBodyType(Integer.parseInt(searchParameters.get("body_type")));
        }
        if(searchParameters.get("beak_type")!=null){
            criteria.setBeakType(Integer.parseInt(searchParameters.get("beak_type")));
        }
        if(searchParameters.get("tail_type")!=null){
            criteria.setTailType(Integer.parseInt(searchParameters.get("tail_type")));
        }
        if(searchParameters.get("leg_type")!=null){
            criteria.setLegType(Integer.parseInt(searchParameters.get("leg_type")));
        }

        List<BirdSearchEntity> searches = service.getSearchEntitiesByParams(criteria);



        return null;
    }

    public List<BirdSearchEntity> searchBirdTest(HashMap<String, String> searchParameters) {
        BirdCriteria criteria = new BirdCriteria();
        if(searchParameters.get("body_type")!=null){
            criteria.setBodyType(Integer.parseInt(searchParameters.get("body_type")));
        }
        if(searchParameters.get("beak_type")!=null){
            criteria.setBeakType(Integer.parseInt(searchParameters.get("beak_type")));
        }
        if(searchParameters.get("tail_type")!=null){
            criteria.setTailType(Integer.parseInt(searchParameters.get("tail_type")));
        }
        if(searchParameters.get("leg_type")!=null){
            criteria.setLegType(Integer.parseInt(searchParameters.get("leg_type")));
        }

        /*WKTReader wkt = new WKTReader();
        try {
            Geometry point = wkt.read("POINT(56.866115 35.482228)");
            Geometry point2 = wkt.read("POINT(55.970541 37.405071)");
            //Geometry polygon = wkt.read("POLYGON((55.884324 37.781568, 55.892025 37.333875, 55.592794 37.394894,55.614975 37.893766, 55.884324 37.781568))");

            System.out.println(point2.distance(point) * 6356752);
            System.out.println(point2.distance(point));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        */
        return service.getSearchEntitiesByParams(criteria);
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
