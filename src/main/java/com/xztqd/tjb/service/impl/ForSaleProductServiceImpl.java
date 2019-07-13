package com.xztqd.tjb.service.impl;

import com.xztqd.tjb.mapper.ForSaleProductMapper;
import com.xztqd.tjb.po.ForSaleProduct;
import com.xztqd.tjb.service.ForSaleProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ForSaleProductServiceImpl implements ForSaleProductService {

    @Autowired
    private ForSaleProductMapper forSaleProductMapper;

    @Override
    public int forSaleProductInsert(ForSaleProduct forSaleProduct) {
        return forSaleProductMapper.forSaleProductInsert(forSaleProduct);
    }
}
