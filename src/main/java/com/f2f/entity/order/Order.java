package com.revengemission.sso.oauth2.server.f2f.domain.order;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class Order extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "ORDER_ID")
//    private Integer id;

    public Order() {
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
}
