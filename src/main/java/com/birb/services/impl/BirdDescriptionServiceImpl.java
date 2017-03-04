package com.birb.services.impl;

import com.birb.domain.BirdDescriptionEntity;
import com.birb.repositories.BirdDescriptionRepository;
import com.birb.services.BirdDescriptionService;
import com.birb.services.BirdSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BirdDescriptionServiceImpl implements BirdDescriptionService {

    @Autowired
    BirdDescriptionRepository repository;

    @Override
    public List<BirdDescriptionEntity> getBirdsByIds(List<Integer> ids) {
        return repository.getShortList(ids);
    }
}
