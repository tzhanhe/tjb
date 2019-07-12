package com.xztqd.tjb.service;

import com.xztqd.tjb.bean.PersonProduct;
import com.xztqd.tjb.dao.PersonProductDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonProductService {
    @Autowired
    PersonProductDaoImpl accountDaoImpl;

    public List<PersonProduct> getPersonProduct(String cstno){
        return accountDaoImpl.select(cstno);
    }
}
