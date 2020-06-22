package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DEPARTMENT")
public class DepartmentB extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "DEPARTMENT_ID")
//    private Integer id;

    @Column(name = "DESCRIPTION")
    private String description;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DepartmentB() {
    }

    public DepartmentB(String description) {
        this.description = description;
    }
}
