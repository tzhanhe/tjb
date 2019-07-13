package com.xztqd.tjb.controller;



import com.alibaba.fastjson.JSON;
import com.xztqd.tjb.po.RecomProduct;
import com.xztqd.tjb.service.impl.RecomProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class RecomProdutController {

    @Autowired
    private RecomProductServiceImpl recomProductService;

    //selectall
    @RequestMapping("/recommendedProducts")
    public Object showRecom(HttpServletRequest req, HttpServletResponse resp){
        return JSON.toJSONString(recomProductService.queryRecom());
    }
}
