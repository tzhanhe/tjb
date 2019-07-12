package com.xztqd.tjb.service;

import com.xztqd.tjb.bean.RecomProduct;
import com.xztqd.tjb.dao.RecomProductDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecomProductService {
    @Autowired
    RecomProductDaoImpl recomProductDao;

    public List<RecomProduct> getRecomProduct(){
        return recomProductDao.query();
    }

}
