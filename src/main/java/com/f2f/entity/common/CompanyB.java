package com.f2f.entity.common;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "COMPANY")
public class CompanyB extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "PERIOD_ID")
//    private Integer id;

    @Column(name = "NAME")
    private String name;

    public CompanyB() {
    }

    public CompanyB(String name) {
        this.name = name;
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
}
