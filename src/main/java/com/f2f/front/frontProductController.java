package com.f2f.front;

import com.f2f.entity.product.ProductDTO;
import com.f2f.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("frontProductController")
@RequestMapping("/front/products")
public class frontProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public List<ProductDTO> getProducts() {
        List<ProductDTO> list = productService.findAllAvailableProducts();
        return list;
    }
}
