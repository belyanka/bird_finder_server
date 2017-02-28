package com.birb.repositories;

import com.birb.domain.BirdDescriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface BirdDescriptionRepository extends JpaRepository<BirdDescriptionEntity, Long> {

}
