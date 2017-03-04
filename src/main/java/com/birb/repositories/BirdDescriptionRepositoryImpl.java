package com.birb.repositories;

import com.birb.domain.BirdDescriptionEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class BirdDescriptionRepositoryImpl implements BirdDescriptionRepositoryCustom {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<BirdDescriptionEntity> getShortList() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<BirdDescriptionEntity> query = cb.createQuery(BirdDescriptionEntity.class);

        Root<BirdDescriptionEntity> root = query.from(BirdDescriptionEntity.class);
        query.select(root.get("name"));

        return em.createQuery(query).getResultList();
    }
}
