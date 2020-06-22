package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "BENEFIT_TYPE")
public class BenefitType extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name ="BENEFIT_TYPE_ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTON")
    private String description ;

}
