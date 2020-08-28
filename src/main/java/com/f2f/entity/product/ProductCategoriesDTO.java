package com.f2f.entity.product;

import java.io.Serializable;

public interface ProductCategoriesDTO {

    String getProductId();
    Long getCategoryId();
    String getFromDate() ;
    String getToDate() ;
    String getDescription() ;
    String getProductName() ;
    String getCategoryName() ;

}
