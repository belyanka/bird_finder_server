package com.birb.repositories;

import com.birb.domain.BirdSearchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BirdSearchRepository extends JpaRepository<BirdSearchEntity, Long>, BirdSearchRepositoryCustom {

}
