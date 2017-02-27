package com.birb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by belyanka on 27.02.2017.
 */
public interface BirdSearchRepository extends JpaRepository<BirdSearchEntity, Long>, JpaSpecificationExecutor {

}
