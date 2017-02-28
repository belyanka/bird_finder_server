package com.birb.services;

import com.birb.domain.BirdSearchEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BirdSearchService{
    public List<BirdSearchEntity> getSearchEntitiesByParams();
}
