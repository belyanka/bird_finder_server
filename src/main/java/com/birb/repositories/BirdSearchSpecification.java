package com.birb.repositories;

import com.birb.domain.BirdSearchEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class BirdSearchSpecification implements Specification<BirdSearchEntity> {

    private final BirdSearchEntity criteria;

    public BirdSearchSpecification(BirdSearchEntity cr) {
        this.criteria = cr;
    }

    @Override
    public Predicate toPredicate(Root<BirdSearchEntity> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        final List<Predicate> predicates = new ArrayList<Predicate>();


        return cb.and(predicates.toArray(new Predicate[predicates.size()]));
    }

}
