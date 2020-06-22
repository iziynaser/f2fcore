package com.f2f.entity.product;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_COLOR")
public class ProductColor extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "PRODUCT_COLOR_ID")
//    private Integer productColorId;

    @Column(name = "COLOR_NAME")
    private String name ;

    @Column(name = "COLOR_VALUE")
    private String value ;

    @Column(name = "PRODUCT_CODE")
    private String productCode ;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
