package com.f2f.entity.common;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CATEGORY_TYPE")
public class CategoryType extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "CATEGORY_TYPE_ID")
//    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    public CategoryType() {
    }

    public CategoryType(String name, String description) {
        this.name = name;
        this.description = description;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
