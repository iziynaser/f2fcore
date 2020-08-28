package com.revengemission.sso.oauth2.server.f2f.domain.order;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ORDER_STATUS")
public class OrderStatus extends BaseEntity implements Serializable {

    private int statusDate ;
    private int startDate;
    private int endDate;
    private int registerDate;
    private int deliveryDate;

}
