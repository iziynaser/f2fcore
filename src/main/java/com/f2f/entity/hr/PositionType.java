package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "POSITION_TYPE")
public class PositionType extends BaseEntity implements Serializable {

    public PositionType() {
    }

}
