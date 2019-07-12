package com.xztqd.tjb.service.impl;

import com.xztqd.tjb.mapper.PersonProductMapper;
import com.xztqd.tjb.po.PersonProduct;
import com.xztqd.tjb.service.PersonProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonProductServiceImpl implements PersonProductService {
    @Autowired
    PersonProductMapper personProductMapper;

    @Override
    public List<PersonProduct> queryPersonProduct(String cstno) {
        return personProductMapper.queryPersonProduct(cstno);
    }
}
