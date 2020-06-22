package com.f2f.entity.common;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CATEGORY")
public class Category extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "CATEGORY_ID")
//    private Integer id;

    @Column(name = "NAME")
    private String name ;

    @ManyToOne
    @JoinColumn(name = "PARENT_CATEGORY_ID")
    private Category parentCategory;

    @Column(name = "CATEGORY_TYPE")
    private Integer categoryType;

    @Column(name = "FROM_DATE")
    private String fromDate;

    @Column(name = "TO_DATE")
    private String toDate;

    @Column(name="DESCRIPTION")
    private String description;

    public Category() {
    }

    public Category(String name, Category parentCategory, Integer categoryType, String fromDate, String toDate) {
        this.name = name;
        this.parentCategory = parentCategory;
        this.categoryType = categoryType;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(int categoryType) {
        this.categoryType = categoryType;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
