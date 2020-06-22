package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "SKILL_TYPE")
public class SkillType extends BaseEntity {

//    @Id
//    @GeneratedValue
//    @Column(name = "SKILL_TYPE_ID")
//    private Integer id;

    @Column(name = "SKILL_TYPE_NAME")
    private String name;

    @Column(name = "SKILL_TYPE_RATE")
    private String rate ;

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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
