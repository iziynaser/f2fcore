package com.f2f.entity.common;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "SERVICE")
public class Service extends BaseEntity implements Serializable {

//    @Id
//    @Column(name = "SERVICE_ID")
//    private Integer id ;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToMany(mappedBy = "services")
    private Collection<Group> groups;

    public Service() {
    }

    public Service( String name, String description, Collection<Group> groups) {
        this.name = name;
        this.description = description;
        this.groups = groups;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


    public Collection<Group> getGroups() {
        return groups;
    }

    public void setGroups(Collection<Group> groups) {
        this.groups = groups;
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

    public String toString(){
        StringBuffer sb = new StringBuffer();
//        sb.append("id :"+ id +" ,");
        sb.append("name :"+ name +" ,");
        sb.append("description :"+ description +" ,");
        return sb.toString();
    }

}
