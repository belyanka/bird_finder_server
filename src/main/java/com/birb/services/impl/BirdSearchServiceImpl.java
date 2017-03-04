package com.birb.services.impl;

import com.birb.domain.BirdCriteria;
import com.birb.domain.BirdSearchEntity;
import com.birb.repositories.BirdSearchRepository;
import com.birb.repositories.BirdSearchSpecification;
import com.birb.services.BirdSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BirdSearchServiceImpl implements BirdSearchService {

    @Autowired
    private BirdSearchRepository repository;

    @Override
    public List<BirdSearchEntity> getSearchEntitiesByParams(BirdCriteria criteria) {
        return repository.findAll(new BirdSearchSpecification(criteria));
    }
}
