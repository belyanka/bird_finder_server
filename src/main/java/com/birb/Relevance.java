package com.birb;


import com.birb.domain.BirdCriteria;
import com.birb.domain.BirdSearchEntity;
import org.springframework.stereotype.Component;

import java.util.*;

import static java.lang.Math.abs;

@Component
public class Relevance {

    public static List<BirdSearchEntity> setRelevanceOrder(List<BirdSearchEntity> original, BirdCriteria criteria){

        HashMap<Integer,BirdSearchEntity> relSearches = new HashMap<>();

        for(BirdSearchEntity search: original){
            int relativity=0;
            if(criteria.getBodyType()!=null){
                relativity+=(2-abs(criteria.getBodyType()-search.getBodyType()))*3;
            }
            if(criteria.getBeakType()!=null){
                relativity+=(2-abs(criteria.getBeakType()-search.getBeakType()))*2;
            }
            if(criteria.getTailType()!=null){
                relativity+=2-abs(criteria.getTailType()-search.getTailType());
            }
            if(criteria.getLegType()!=null){
                relativity+=2-abs(criteria.getLegType()-search.getLegType());
            }
            relSearches.put(relativity,search);
        }

        TreeMap<Integer,BirdSearchEntity> sortedSearch = new TreeMap<>(relSearches);

        while(sortedSearch.size()>15){
            sortedSearch.remove(sortedSearch.lastKey());
        }

        return new ArrayList<BirdSearchEntity>(sortedSearch.values());
    }

    class RelComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }
}
