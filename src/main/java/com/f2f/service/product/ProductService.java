package com.f2f.service.product;

import com.f2f.dao.product.FeaturesDTO;
import com.f2f.dao.product.ProductDao;
import com.f2f.dao.product.ProductFeatureGroupDao;
import com.f2f.entity.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Component
@PreAuthorize("isAuthenticated()")
public class ProductService {

    @Autowired
    ProductDao productDao ;

    @Autowired
    ProductFeatureGroupDao productFeatureGroupDao ;

    @PreAuthorize("hasRole('FIND_PRODUCT')")
    public List<String> findAllByNameContains(String name) {
       return (List<String>) productDao.findAllByNameContains(name);
    }

    @PreAuthorize("hasRole('FIND_PRODUCT')")
    public List<Product> findAll() {
        return (List<Product>) productDao.findAll();
    }

    @PreAuthorize("hasRole('SAVE_PRODUCT')")
    public Product save(Product product) {
        Product p = productDao.save(product);
        return p;
    }

    public List<FeaturesDTO> getListOfFeatures(){
        List<FeaturesDTO> list = productFeatureGroupDao.getListOfFeatures();
        return list;
    }

    public Product findProductById(Long id){
        Product product = productDao.findProductById(id);
        return product;
    }

    public Product findProductMainPartWithId(Long productId) {
            Product p = productDao.findProductById(productId);
            return p;
    }
}
