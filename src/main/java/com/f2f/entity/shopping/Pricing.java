package com.f2f.entity.shopping;

import com.f2f.entity.product.Product;
import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "PRICING")
public class Pricing extends BaseEntity {

//    @Id
//    @GeneratedValue
//    @Column(name = "PRICING_ID")
//    private Integer id;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


    private Product productId;

    //private PricingType pricingType;

    private String fromDate ;

    private String throughDate ;


}
