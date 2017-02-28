package com.birb.domain;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Polygon;

import javax.persistence.*;

@Entity
@Table(name = "bird_search", schema = "public", catalog = "postgres")
public class BirdSearchEntity {
    private int id;
    private Integer spId;
    private String sex;
    private Integer beakType;
    private Integer bodyType;
    private Integer tailType;
    private Integer legType;
    private String area;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sp_id")
    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "beak_type")
    public Integer getBeakType() {
        return beakType;
    }

    public void setBeakType(Integer beakType) {
        this.beakType = beakType;
    }

    @Basic
    @Column(name = "body_type")
    public Integer getBodyType() {
        return bodyType;
    }

    public void setBodyType(Integer bodyType) {
        this.bodyType = bodyType;
    }

    @Basic
    @Column(name = "tail_type")
    public Integer getTailType() {
        return tailType;
    }

    public void setTailType(Integer tailType) {
        this.tailType = tailType;
    }

    @Basic
    @Column(name = "leg_type")
    public Integer getLegType() {
        return legType;
    }

    public void setLegType(Integer legType) {
        this.legType = legType;
    }

    @Basic
    @Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BirdSearchEntity that = (BirdSearchEntity) o;

        if (id != that.id) return false;
        if (spId != null ? !spId.equals(that.spId) : that.spId != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (beakType != null ? !beakType.equals(that.beakType) : that.beakType != null) return false;
        if (bodyType != null ? !bodyType.equals(that.bodyType) : that.bodyType != null) return false;
        if (tailType != null ? !tailType.equals(that.tailType) : that.tailType != null) return false;
        if (legType != null ? !legType.equals(that.legType) : that.legType != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (spId != null ? spId.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (beakType != null ? beakType.hashCode() : 0);
        result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
        result = 31 * result + (tailType != null ? tailType.hashCode() : 0);
        result = 31 * result + (legType != null ? legType.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        return result;
    }
}
