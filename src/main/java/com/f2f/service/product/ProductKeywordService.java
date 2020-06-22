package com.f2f.service.product;

import com.f2f.dao.product.ProductDao;
import com.f2f.dao.product.ProductKeywordDao;
import com.f2f.entity.product.Product;
import com.f2f.entity.product.ProductKeyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PreAuthorize("isAuthenticated()")
public class ProductKeywordService {

    @Autowired
    ProductKeywordDao productKeywordDao;

    @Autowired
    ProductDao productDao ;

    public List<ProductKeyword> findAllByProduct(Long productId){
        Product product = productDao.findProductById(productId);
        List<ProductKeyword> products = productKeywordDao.findAllByProduct(product);
        return products;
    }

    public ProductKeyword save(ProductKeyword productKeyword){
        ProductKeyword pKeyword = productKeywordDao.save(productKeyword);
        return pKeyword;
    }

}
