package com.f2f.service.product;

import com.f2f.dao.product.ProductDao;
import com.f2f.dao.product.ProductMeasureDao;
import com.f2f.entity.product.Product;
import com.f2f.entity.product.ProductMeasure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

@Component
@PreAuthorize("isAuthenticated()")
public class ProductMeasureService {

    @Autowired
    ProductMeasureDao productMeasureDao;

    @Autowired
    ProductDao productDao;

    public ProductMeasure save(ProductMeasure productMeasure){
        ProductMeasure feature = productMeasureDao.save(productMeasure);
        return feature;
    }

    public ProductMeasure load(String productId) {
        ProductMeasure pm;
        Product product = productDao.findProductById(Long.valueOf(productId));
        if(product!=null)
            pm = productMeasureDao.findAllByProduct(product);
        else
            pm = new ProductMeasure();

        return pm;
    }
}
