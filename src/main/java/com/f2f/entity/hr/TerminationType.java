package com.revengemission.sso.oauth2.server.f2f.domain.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "TERMINATION_TYPE")
public class TerminationType extends BaseEntity {

//    @Id
//    @GeneratedValue
//    @Column(name ="TERMINATION_TYPE_ID")
//    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTON")
    private String description ;

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

    public TerminationType(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
