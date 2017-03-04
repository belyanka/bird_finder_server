package com.birb.services;

import com.birb.domain.BirdDescriptionEntity;

import java.util.List;

public interface BirdDescriptionService  {

    List<BirdDescriptionEntity> getBirdsByIds();
}
