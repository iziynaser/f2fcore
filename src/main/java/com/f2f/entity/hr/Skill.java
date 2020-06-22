package com.f2f.entity.hr;

import com.f2f.entity.common.Person;
import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SKILL")
public class Skill extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "SKILL_ID")
//    private Integer id;

    @Column(name = "SKILL_NAME")
    private String name;

    @ManyToOne
    private Person person ;

    @Column(name = "EXPERIENCE")
    private int experience ;

    @Column(name="SKILL_LEVEL")
    private int skillLevel;


    public Skill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }
}
