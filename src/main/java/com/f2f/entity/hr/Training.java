package com.f2f.entity.hr;

import com.f2f.entity.common.Person;
import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TRAINING")
public class Training extends BaseEntity implements Serializable {

//    @Id
//    @Column(name = "TRAINING_ID")
//    private Integer id;

    @ManyToOne
    private Person person;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Training() {
    }
}
