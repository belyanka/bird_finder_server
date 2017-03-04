package com.birb.repositories;

import com.birb.domain.BirdCriteria;
import com.birb.domain.BirdSearchEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class BirdSearchSpecification implements Specification<BirdSearchEntity> {

    private final BirdCriteria criteria;

    public BirdSearchSpecification(BirdCriteria cr) {
        this.criteria = cr;
    }

    @Override
    public Predicate toPredicate(Root<BirdSearchEntity> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        final List<Predicate> predicates = new ArrayList<Predicate>();

        Path<Integer> bodyType = root.get("bodyType");
        Path<Integer> beakType = root.get("beakType");

        if(criteria.getBodyType()!=null){
            predicates.add(cb.equal(bodyType,criteria.getBodyType()));
        }

        if(criteria.getBeakType()!=null){
            predicates.add(cb.equal(beakType,criteria.getBeakType()));
        }

        return cb.and(predicates.toArray(new Predicate[predicates.size()]));
    }

}
