package com.birb;

import com.birb.domain.BirdDescriptionEntity;
import com.birb.domain.BirdSearchEntity;
import com.birb.repositories.BirdDescriptionRepository;
import com.birb.repositories.BirdSearchRepository;
import com.birb.services.BirdSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@RestController
public class ApiController {

    /*@Autowired
    private BirdSearchService service;*/
    @Autowired
    private Birder birder;

    /*@RequestMapping(value = "/bird", method = RequestMethod.GET)
    public List<BirdDescriptionEntity> bird() {
        Iterable<BirdDescriptionEntity> birds = repository.findAll();
        return new ArrayList<>((Collection<? extends BirdDescriptionEntity>) birds);
    }*/

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public List<BirdSearchEntity> search(@RequestParam HashMap<String, String> searchParameters){
        return birder.searchBirdTest(searchParameters);
        //return service.getSearchEntitiesByParams();
    }

}
