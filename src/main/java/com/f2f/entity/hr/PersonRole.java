package com.f2f.entity.hr;

import com.f2f.entity.common.Person;
import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PERSON_ROLE")
public class PersonRole extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "PERSON_ROLE_ID")
//    private Integer id;

    private Person person;

    @Column(name = "ROLE_NAME")
    private String roleName;

    @Column(name = "FROM_DATE")
    private String fromDate;

    @Column(name = "TO_DATE")
    private String toDate;

    public PersonRole() {
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
}
