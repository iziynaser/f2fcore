package com.f2f.controller.product;

import com.f2f.entity.product.Brand;
import com.f2f.service.product.BrandService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController("BrandController")
@RequestMapping("/Brand")
public class BrandController {

    @Autowired
    BrandService service;

    @GetMapping("/brand")
    public List<Brand> getDogs(){
        List<Brand> rt = service.findAll();
        return rt;
    }

    @GetMapping("/brand/{id}")
    public Brand  findById(@PathVariable(value = "id") Long id)throws NotFoundException{
        Optional<Brand> b= service.findById(id);
        if(!b.isPresent())
            throw new NotFoundException("id:"+id);
        return b.get();
    }

    @PostMapping("/brand")
    public Brand save(@RequestBody Brand brand)
    {
        Brand b = service.save(brand);
        return b;
    }

    @DeleteMapping("brand/{id}")
    public Map<String,Boolean> deleteById(@PathVariable Long id)throws NotFoundException{
        Optional<Brand> b= service.findById(id);
        if(!b.isPresent())
            throw new NotFoundException("id:"+id);

        service.delete(b.get());
        HashMap response = new HashMap();
        response.put("deleted",true);
        return response;
    }


}
