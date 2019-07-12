package com.xztqd.tjb.controller;



import com.xztqd.tjb.po.RecomProduct;
import com.xztqd.tjb.service.impl.RecomProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class RecomProdutController {

    @Autowired
    private RecomProductServiceImpl recomProductService;


    @RequestMapping("/recommendedProducts")
    public List<RecomProduct> showRecom(){
        return recomProductService.queryRecom();
    }
}
