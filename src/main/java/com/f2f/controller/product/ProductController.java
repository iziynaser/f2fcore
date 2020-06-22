package com.f2f.controller.product;

import com.f2f.entity.product.Product;
import com.f2f.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("ProductController")
@RequestMapping("/f2f/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public List<Product> getProducts(){
        List<Product> list = productService.findAll();
        return list;
    }

    @ResponseBody
    @PostMapping(value = "/save")
    public  Product createProduct(@RequestBody Product product){
        Product p = productService.save(product);
        //F2fSuccessResponse response = new F2fSuccessResponse.F2fSuccessBuilder().withBody(p).build();
        //return new ResponseEntity<F2fSuccessResponse>(response,HttpStatus.OK);
        return p;
    }

    @ResponseBody
    @GetMapping("/loadProductMainPart/")
    public Product findProductMainPartWithId(@RequestParam("productId") String productId){
            Long id = Long.valueOf(productId);
            Product product = productService.findProductMainPartWithId(id);
            return product;
    }

}

