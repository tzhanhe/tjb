package com.xztqd.tjb.service.impl;

import com.xztqd.tjb.mapper.RecomProductMapper;
import com.xztqd.tjb.po.RecomProduct;
import com.xztqd.tjb.service.RecomProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecomProductServiceImpl implements RecomProductService {

    @Autowired
    RecomProductMapper recomProductMapper;

    @Override
    public List<RecomProduct> queryRecom() {
        return recomProductMapper.queryRecom();
    }

//    @Override
//    public int FinUpdate(int money, String id) {
//        return recomProductMapper.FinUpdate(money,id);
//    }
}
