package com.xztqd.tjb.service;

import com.xztqd.tjb.po.PersonProduct;

import java.util.List;

public interface PersonProductService {
    public List<PersonProduct> queryPersonProduct(String cstno);
}
