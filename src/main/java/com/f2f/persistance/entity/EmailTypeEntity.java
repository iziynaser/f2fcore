package com.f2f.persistance.entity;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class EmailTypeEntity extends BaseEntity implements Serializable {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
