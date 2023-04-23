package com.f2f.front;

import com.f2f.entity.product.ProductPrice;
import com.f2f.service.product.ProductPriceService;
import com.f2f.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("frontProductPriceController")
@RequestMapping("/front/ProductPrice")
public class frontProductPriceController {

    @Autowired
    ProductPriceService productPriceService;


    @ResponseBody
    @GetMapping("/list")
    public List<ProductPrice> getProductPrices(){
        List<ProductPrice> productPrices = productPriceService.findAll();
        return productPrices;
    }
}
