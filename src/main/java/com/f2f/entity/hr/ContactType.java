package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mbzo on 1/23/15.
 */

@Entity
@Table(name = "CONTACT_TYPE")
public class ContactType extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "CONTACT_TYPE_ID")
//    private Integer id;

    @Column(name = "NAME")
    private String name;

//    @Column(name = "VERSION")
//    private Integer version;

    @Column(name = "DESCRIPTION")
    private String description;

    private Contact contact;

    public ContactType() {
    }

    public ContactType(String name, String description) {
        this.name = name;
        //this.version = version;
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

//    public Integer getVersion() {
//        return version;
//    }
//
//    public void setVersion(Integer version) {
//        this.version = version;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
