package com.f2f.entity.hr;

import com.f2f.entity.product.Product;
import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PAYMENT_METHOD")
public class PaymentMethod extends BaseEntity implements Serializable {

    private String fromDate ;

    private String throughDate ;

    private PaymentMethod paymentMethod;

    private Product product;

}
