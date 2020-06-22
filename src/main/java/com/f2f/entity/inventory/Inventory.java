package com.f2f.entity.inventory;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "INVENTORY")
public class Inventory extends BaseEntity {

//    @Id
//    @GeneratedValue
//    @Column(name = "INVENTORY_ID")
//    private Integer id;

    @Column(name = "NAME")
    private String name;

    public Inventory() {
    }

    public Inventory(String name) {
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
