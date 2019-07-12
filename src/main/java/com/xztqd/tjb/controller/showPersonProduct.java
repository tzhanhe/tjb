package com.xztqd.tjb.controller;

import com.xztqd.tjb.bean.PersonProduct;
import com.xztqd.tjb.service.PersonProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class showPersonProduct {
    @Autowired
    private PersonProductService accountService;


    @GetMapping("/showpersonproduct")
    public List<PersonProduct> showPersonProduct(){
        System.out.println(accountService.getPersonProduct());
        return accountService.getPersonProduct();
    }
}
