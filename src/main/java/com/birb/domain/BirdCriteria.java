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

    public void setField(String fieldName, String value){
        switch(fieldName){
            case "body_type":
                setBodyType(Integer.parseInt(value));
                break;
            case "beak_type":
                setBeakType(Integer.parseInt(value));
                break;
            case "main_size":
                break;
            case "beak_length":
                break;
            case "beak_width":
                break;
        }
    }
}
