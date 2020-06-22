package com.f2f.dao.article;

import com.f2f.entity.common.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("ArticleDao")
public interface ArticleDao extends CrudRepository<Article,Long> {
}
