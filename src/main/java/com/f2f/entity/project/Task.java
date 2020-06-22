package com.f2f.entity.project;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "TASK")
public class Task extends BaseEntity {

//    @Id
//    @GeneratedValue
//    @Column(name = "TASK_ID")
//    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description ;

    @ManyToOne
    private Project project;

    public Task() {
    }

    public Task( String name, String description, Project project) {
        this.name = name;
        this.description = description;
        this.project = project;
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
