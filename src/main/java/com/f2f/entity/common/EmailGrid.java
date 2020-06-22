package com.f2f.entity.common;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "EMAILS")
public class EmailGrid extends BaseEntity {

    private String totalProperty  = "total";
    private String successProperty = "success";

    List<Email> emails = new ArrayList<Email>();

    public String getTotalProperty() {
        return totalProperty;
    }

    public void setTotalProperty(String totalProperty) {
        this.totalProperty = totalProperty;
    }

    public String getSuccessProperty() {
        return successProperty;
    }

    public void setSuccessProperty(String successProperty) {
        this.successProperty = successProperty;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }
}
