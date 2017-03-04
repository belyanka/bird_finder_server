package com.birb.repositories;

import com.birb.domain.BirdCriteria;
import com.birb.domain.BirdDescriptionEntity;
import com.birb.domain.BirdSearchEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class BirdSearchRepositoryImpl implements BirdSearchRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<BirdSearchEntity> getByCriteria(BirdCriteria criteria) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<BirdSearchEntity> query = cb.createQuery(BirdSearchEntity.class);

        Root<BirdSearchEntity> root = query.from(BirdSearchEntity.class);
        Path<Integer> bodyType = root.get("bodyType");
        Path<Integer> beakType = root.get("beakType");

        List<Predicate> predicates = new ArrayList<Predicate>();
        if(criteria.getBodyType()!=null){
            predicates.add(cb.equal(bodyType,criteria.getBodyType()));
        }

        if(criteria.getBeakType()!=null){
            predicates.add(cb.equal(beakType,criteria.getBeakType()));
        }

        query.where(predicates.toArray(new Predicate[]{}));
        return em.createQuery(query).getResultList();
    }
}
