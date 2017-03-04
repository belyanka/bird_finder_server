package com.birb.services;

import com.birb.domain.BirdCriteria;
import com.birb.domain.BirdSearchEntity;

import java.util.List;

public interface BirdSearchService{
    public List<BirdSearchEntity> getSearchEntitiesByParams(BirdCriteria criteria);
}
