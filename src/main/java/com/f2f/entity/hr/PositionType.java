package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "POSITION_TYPE")
public class PositionType extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "POSITION_TYPE_ID")
//    private Integer id;

    public PositionType() {
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


}
