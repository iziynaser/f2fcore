package com.revengemission.sso.oauth2.server.f2f.domain.order;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "REQUEST_ITEM")
public class RequestItem extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "REQUEST_ITEM_ID")
    private Integer id;

}
