package com.f2f.entity.hr;

import com.f2f.entity.product.Product;
import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PAYMENT_METHOD")
public class PaymentMethod extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "PAYMENT_METHOD_ID")
//    private Integer id;

    private String fromDate ;

    private String throughDate ;

    private PaymentMethod paymentMethod;

    private Product product;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


}
