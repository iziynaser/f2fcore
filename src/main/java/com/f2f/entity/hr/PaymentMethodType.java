package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_METHOD_TYPE")
public class PaymentMethodType extends BaseEntity {

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTON")
    private String description ;

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

    public PaymentMethodType(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
