package com.xztqd.tjb.controller;


import com.xztqd.tjb.po.PersonProduct;
import com.xztqd.tjb.service.impl.PersonProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonProductController {
    @Autowired
    PersonProductServiceImpl personProductService;

    @RequestMapping("/personProduct/{cstno}")
    public List<PersonProduct> queryPersonProduct(@PathVariable("cstno") String cstno){
        return personProductService.queryPersonProduct(cstno);
    }

}
