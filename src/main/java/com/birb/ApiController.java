package com.birb;

import com.birb.domain.BirdDescriptionEntity;
import com.birb.repositories.BirdDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private BirdDescriptionRepository repository;

    @RequestMapping(value = "/bird", method = RequestMethod.GET)
    public List<BirdDescriptionEntity> bird() {
        Iterable<BirdDescriptionEntity> birds = repository.findAll();
        return new ArrayList<>((Collection<? extends BirdDescriptionEntity>) birds);
    }

}
