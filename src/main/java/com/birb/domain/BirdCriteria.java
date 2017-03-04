package com.birb.domain;

public class BirdCriteria {

    private Integer beakType;
    private Integer bodyType;
    private Integer tailType;
    private Integer legType;

    public BirdCriteria() {

    }

    public Integer getBeakType() {
        return beakType;
    }

    public void setBeakType(Integer beakType) {
        this.beakType = beakType;
    }

    public Integer getBodyType() {
        return bodyType;
    }

    public void setBodyType(Integer bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getTailType() {
        return tailType;
    }

    public void setTailType(Integer tailType) {
        this.tailType = tailType;
    }

    public Integer getLegType() {
        return legType;
    }

    public void setLegType(Integer legType) {
        this.legType = legType;
    }
}
