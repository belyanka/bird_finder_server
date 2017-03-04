package com.birb.repositories;

import com.birb.domain.BirdDescriptionEntity;
import java.util.List;

public interface BirdDescriptionRepositoryCustom {
    List<BirdDescriptionEntity> getShortList(List<Integer> ids);
}
