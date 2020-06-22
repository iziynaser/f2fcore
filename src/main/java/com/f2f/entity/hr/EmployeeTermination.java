package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EMPLOYEE_TERMINATION")
public class EmployeeTermination extends BaseEntity implements Serializable {


    //    @Id
//    @GeneratedValue
//    @Column(name = "EMPLOYEE_TERMINATION_ID")
//    private Integer id;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

}

