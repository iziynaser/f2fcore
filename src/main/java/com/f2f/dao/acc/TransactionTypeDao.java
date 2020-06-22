package com.f2f.dao.acc;

import com.f2f.entity.acc.TransactionType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("TransactionTypeDao")
public interface TransactionTypeDao extends CrudRepository<TransactionType,Long>{

}
