package com.xztqd.tjb.controller;

import com.xztqd.tjb.bean.RecomProduct;
import com.xztqd.tjb.service.RecomProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class showRecomProduct {
    @Autowired
    RecomProductService recomProductService;

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/recommendedProducts")
    public List<RecomProduct> showRecomProduct(){
        return recomProductService.getRecomProduct();
    }
}
