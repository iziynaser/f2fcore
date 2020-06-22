package com.f2f.dao.product;

import com.f2f.entity.product.ProductPrice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductPriceDao")
public interface ProductPriceDao extends CrudRepository<ProductPrice,Long> {

}
