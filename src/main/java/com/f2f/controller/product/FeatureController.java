package com.f2f.controller.product;

import com.f2f.dao.product.FeaturesDTO;
import com.f2f.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("FeatureController")
@RequestMapping("/f2f/feature")
public class FeatureController {

    @Autowired
    ProductService productService;

    @ResponseBody
    @GetMapping("/features")
    public List<FeaturesDTO> getListOfFeatures(Long productId){
        List<FeaturesDTO> list = productService.getListOfFeatures(productId);
        return list;
    }
}
