package com.birb;

import com.birb.domain.BirdDescriptionEntity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by belyanka on 27.02.2017.
 */
public interface DataConnection {
    public List<BirdDescriptionEntity> searchBird(HashMap<String, String> searchParameters);
    public List<BirdDescriptionEntity> getBirdsList();
    public BirdDescriptionEntity getBirdByName();
    public List<BirdDescriptionEntity> getBirdListByTaxonomy();
}
