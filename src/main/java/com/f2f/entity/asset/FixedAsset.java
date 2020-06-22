package com.revengemission.sso.oauth2.server.f2f.domain.asset;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "FIXED_ASSET")
public class FixedAsset extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "FIXED_ASSET_ID")
//    private Integer id;

    private String name;

    private Integer lastDateService;

    private Integer nextDateService;

    private String description;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLastDateService() {
        return lastDateService;
    }

    public void setLastDateService(Integer lastDateService) {
        this.lastDateService = lastDateService;
    }

    public Integer getNextDateService() {
        return nextDateService;
    }

    public void setNextDateService(Integer nextDateService) {
        this.nextDateService = nextDateService;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FixedAsset() {
    }

    public FixedAsset(String name, Integer lastDateService, Integer nextDateService, String description) {
        this.name = name;
        this.lastDateService = lastDateService;
        this.nextDateService = nextDateService;
        this.description = description;
    }
}
