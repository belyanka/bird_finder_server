package com.birb;

import com.birb.domain.BirdDescriptionEntity;
import com.birb.domain.BirdSearchEntity;
import com.birb.services.BirdSearchService;
import com.birb.services.impl.BirdSearchServiceImpl;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import com.vividsolutions.jts.operation.distance.DistanceOp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class Birder implements DataConnection {

    @Autowired
    private BirdSearchService service;

    @Override
    public List<BirdDescriptionEntity> searchBird(HashMap<String, String> searchParameters) {
        return null;
    }

    public List<BirdSearchEntity> searchBirdTest(HashMap<String, String> searchParameters) {
        WKTReader wkt = new WKTReader();
        try {
            Geometry point = wkt.read("POINT(56.866115 35.482228)");
            Geometry point2 = wkt.read("POINT(55.970541 37.405071)");
            //Geometry polygon = wkt.read("POLYGON((55.884324 37.781568, 55.892025 37.333875, 55.592794 37.394894,55.614975 37.893766, 55.884324 37.781568))");

            System.out.println(point2.distance(point) * 6356752);
            System.out.println(point2.distance(point));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return service.getSearchEntitiesByParams();
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
