package com.birb.domain;

import javax.persistence.*;

@Entity
@Table(name = "bird_description", schema = "public", catalog = "postgres")
public class BirdDescriptionEntity {
    private int id;
    private String name;
    private Integer taxonomyOrder;
    private Integer taxonomyFamily;
    private Integer taxonomyGenus;
    private String species;
    private String description;
    private String photo;
    private String previewPhoto;
    private String flyingPhoto;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "taxonomy_order")
    public Integer getTaxonomyOrder() {
        return taxonomyOrder;
    }

    public void setTaxonomyOrder(Integer taxonomyOrder) {
        this.taxonomyOrder = taxonomyOrder;
    }

    @Basic
    @Column(name = "taxonomy_family")
    public Integer getTaxonomyFamily() {
        return taxonomyFamily;
    }

    public void setTaxonomyFamily(Integer taxonomyFamily) {
        this.taxonomyFamily = taxonomyFamily;
    }

    @Basic
    @Column(name = "taxonomy_genus")
    public Integer getTaxonomyGenus() {
        return taxonomyGenus;
    }

    public void setTaxonomyGenus(Integer taxonomyGenus) {
        this.taxonomyGenus = taxonomyGenus;
    }

    @Basic
    @Column(name = "species")
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "preview_photo")
    public String getPreviewPhoto() {
        return previewPhoto;
    }

    public void setPreviewPhoto(String previewPhoto) {
        this.previewPhoto = previewPhoto;
    }

    @Basic
    @Column(name = "flying_photo")
    public String getFlyingPhoto() {
        return flyingPhoto;
    }

    public void setFlyingPhoto(String flyingPhoto) {
        this.flyingPhoto = flyingPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BirdDescriptionEntity that = (BirdDescriptionEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (taxonomyOrder != null ? !taxonomyOrder.equals(that.taxonomyOrder) : that.taxonomyOrder != null)
            return false;
        if (taxonomyFamily != null ? !taxonomyFamily.equals(that.taxonomyFamily) : that.taxonomyFamily != null)
            return false;
        if (taxonomyGenus != null ? !taxonomyGenus.equals(that.taxonomyGenus) : that.taxonomyGenus != null)
            return false;
        if (species != null ? !species.equals(that.species) : that.species != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (previewPhoto != null ? !previewPhoto.equals(that.previewPhoto) : that.previewPhoto != null) return false;
        if (flyingPhoto != null ? !flyingPhoto.equals(that.flyingPhoto) : that.flyingPhoto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (taxonomyOrder != null ? taxonomyOrder.hashCode() : 0);
        result = 31 * result + (taxonomyFamily != null ? taxonomyFamily.hashCode() : 0);
        result = 31 * result + (taxonomyGenus != null ? taxonomyGenus.hashCode() : 0);
        result = 31 * result + (species != null ? species.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (previewPhoto != null ? previewPhoto.hashCode() : 0);
        result = 31 * result + (flyingPhoto != null ? flyingPhoto.hashCode() : 0);
        return result;
    }
}
