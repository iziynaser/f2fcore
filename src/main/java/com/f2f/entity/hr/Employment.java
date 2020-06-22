package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EMPLOYMENT")
public class Employment extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "EMPLOYMENT_ID")
//    private Integer id;

    @Column(name = "EMPLOYMENT_TYPE")
    private String employmentType;

    @Column(name = "START_EMPLOYMENT_DATE")
    private String startEmploymentDate;

    @Column(name = "END_EMPLOYMENT_DATE")
    private String endEmploymentDate;

    public String getEmploymentType() {
        return employmentType;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getStartEmploymentDate() {
        return startEmploymentDate;
    }

    public void setStartEmploymentDate(String startEmploymentDate) {
        this.startEmploymentDate = startEmploymentDate;
    }

    public String getEndEmploymentDate() {
        return endEmploymentDate;
    }

    public void setEndEmploymentDate(String endEmploymentDate) {
        this.endEmploymentDate = endEmploymentDate;
    }
}
