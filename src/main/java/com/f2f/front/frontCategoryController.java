package com.f2f.front;

import com.f2f.entity.common.Category;
import com.f2f.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("frontCategoryController")
@RequestMapping("/front/Category")
public class frontCategoryController {
    @Autowired
    CategoryService categoryService;

    @ResponseBody
    @GetMapping(value="/listById")
    public List<Category> findAllCategoriesById(Long id, Long cId){
        List<Category> categories = categoryService.findAllByParentCategoryAndCategoryType(id,cId);
        return categories;
    }
}
