package com.birb.repositories;

import com.birb.domain.BirdCriteria;
import com.birb.domain.BirdSearchEntity;

import java.util.List;

public interface BirdSearchRepositoryCustom {
    List<BirdSearchEntity> getByCriteria(BirdCriteria criteria);
}
