package com.f2f.dao.acc;

import com.f2f.entity.acc.Bank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("BankDao")
public interface BankDao extends CrudRepository<Bank,Long>{

}
