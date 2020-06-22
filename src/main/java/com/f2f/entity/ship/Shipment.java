package com.f2f.entity.ship;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SHIPMENT")
public class Shipment extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name ="SHIPMENT_ID")
//    private Integer id;

    @Column(name = "READY_DATE")
    private Integer readyDate;

    @Column(name = "SHIP_DATE")
    private Integer shipDate;

    @Column(name = "ARRIVAL_DATE")
    private Integer arrivalDate;

    public Shipment() {
    }

    public Shipment(Integer readyDate, Integer shipDate, Integer arrivalDate) {
        this.readyDate = readyDate;
        this.shipDate = shipDate;
        this.arrivalDate = arrivalDate;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

}
