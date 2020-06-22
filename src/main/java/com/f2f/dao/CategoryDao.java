package com.f2f.dao;

import com.f2f.entity.common.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("CategoryDao")
public interface CategoryDao  extends CrudRepository<Category,Long> {

}
