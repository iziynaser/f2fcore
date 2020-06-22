package com.revengemission.sso.oauth2.server.f2f.domain.order;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "ORDER_ITEM_ID")
//    private Integer id;
//
//    public OrderItem() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

}
