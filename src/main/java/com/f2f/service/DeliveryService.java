package com.f2f.service;

import com.f2f.dao.DeliveryDao;
import com.f2f.entity.Delivery;
import com.revengemission.sso.oauth2.server.domain.UserAccount;
import com.revengemission.sso.oauth2.server.persistence.entity.UserAccountEntity;
import com.revengemission.sso.oauth2.server.persistence.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class DeliveryService {

    @Autowired
    DeliveryDao deliveryDao;

    @Autowired
    UserAccountRepository userAccountRepository;

    public List<Delivery> findAllByUserAccount(UserAccount userAccount){

        UserAccountEntity userAccountEntity = userAccountRepository.findByUsername(userAccount.getUsername());

        ArrayList<Delivery> deliveryArrayList= new ArrayList<Delivery>();

        Iterable<Delivery> deliveries = deliveryDao.findAllByUserAccountEntity(userAccountEntity);
        deliveries.forEach(delivery -> deliveryArrayList.add(delivery));
        return deliveryArrayList;
    }

    public Delivery save(Delivery delivery){
        Delivery result = deliveryDao.save(delivery);
        return result;
    }

    public Delivery findFirstDeliveryByUserAccount(UserAccount userAccount){
        UserAccountEntity userAccountEntity = userAccountRepository.findByUsername(userAccount.getUsername());
        Delivery delivery = deliveryDao.findFirstByUserAccountEntityOrderByDateCreated(userAccountEntity);
        return delivery;
    }

    public void deleteDeliveryById(Long id) {
        deliveryDao.deleteById(id);
    }

    public Delivery findFirstById(Long id) {
        Delivery delivery = deliveryDao.findFirstById(id);
        return delivery;
    }
}
