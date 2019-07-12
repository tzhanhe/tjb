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
    private  PersonProductMapper personProductMapper;

    @Override
    public int personProductInsert(PersonProduct personProduct) {
        return personProductMapper.personProductInsert(personProduct);
    }

    @Override
    public int personProductDelete(String ppflwno) {
        return personProductMapper.personProductDelete(ppflwno);
    }

    @Override
    public int personProductUpdate(PersonProduct personProduct) {
        return personProductMapper.personProductUpdate(personProduct);
    }

    @Override
    public PersonProduct personProductSelectOne(PersonProduct personProduct) {
        return personProductMapper.personProductSelectOne(personProduct);
    }

    @Override
    public List<PersonProduct> personProductSelectAll(int np, int size) {
        return personProductMapper.personProductSelectAll((np-1)*size,size);
    }
}
