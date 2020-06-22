package com.f2f.dao.product;

import com.f2f.entity.product.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("ProductDao")
public interface ProductDao extends CrudRepository<Product,Long> {

    List<String> findAllByNameContains(String productName);

    Product findProductById(Long id);
}
