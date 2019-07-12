package com.xztqd.tjb.dao;

import com.xztqd.tjb.bean.PersonProduct;

import java.util.List;

public interface PersonProductDao {
    public List<PersonProduct> select(String cstno);
}
