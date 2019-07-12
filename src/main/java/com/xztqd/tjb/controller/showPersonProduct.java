package com.xztqd.tjb.controller;

import com.xztqd.tjb.bean.PersonProduct;
import com.xztqd.tjb.service.PersonProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class showPersonProduct {
    @Autowired
    private PersonProductService accountService;

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/showpersonproduct/{cstno}")
    public List<PersonProduct> showPersonProduct(@PathVariable("cstno") String cstno){
        System.out.println(accountService.getPersonProduct(cstno));
        return accountService.getPersonProduct(cstno);
    }
}
