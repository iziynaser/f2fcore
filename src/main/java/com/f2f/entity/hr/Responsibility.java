package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "RESPONSIBILITY")
public class Responsibility extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "RESPONSIBILITY_ID")
//    private Integer id;

    private Position position;

    @Column(name = "NAME")
    private String name ;

    @Column(name = "DESCRIPTION")
    private String description;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

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

    public Responsibility() {
    }
}
