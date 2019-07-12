package com.xztqd.tjb.service;

import com.xztqd.tjb.po.PersonProduct;

import java.util.List;

public interface PersonProductService {
    //0insert
    public int personProductInsert(PersonProduct personProduct);

    //1delete
    public int personProductDelete(String ppflwno);
    //2update
    public int personProductUpdate(PersonProduct personProduct);
    //3selectOne
    public PersonProduct personProductSelectOne(PersonProduct personProduct);
    //4selectAll
    public List<PersonProduct> personProductSelectAll( int np, int size);
}
