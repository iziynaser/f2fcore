package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "HOLIDAY")
public class Holiday extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "HOLIDAY_ID")
//    private Integer id;

    public Holiday() {
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
}
