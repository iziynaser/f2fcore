package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PERSON_TYPE.sql")
public class PersonType extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "PERSON_TYPE_ID")
//    private Integer id;

    @Column(name = "NAME")
    private String name ;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "DESCRIPTION")
    private String description;

    public PersonType() {
    }

    public PersonType(Integer version, String description) {
        this.version = version;
        this.description = description;
    }

//    @Version
//    public Integer getVersion() {
//        return version;
//    }
//
//    public void setVersion(Integer version) {
//        this.version = version;
//    }

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
