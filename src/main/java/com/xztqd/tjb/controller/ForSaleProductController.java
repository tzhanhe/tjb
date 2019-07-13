package com.xztqd.tjb.controller;


import com.xztqd.tjb.po.ForSaleProduct;
import com.xztqd.tjb.service.impl.ForSaleProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ForSaleProductController {

    @Autowired
    private ForSaleProductServiceImpl forSaleProductService;

    //insert
    @RequestMapping("/forSaleProductInsert")
    public Object forSaleProductInsert(HttpServletRequest req, HttpServletResponse resp){
        String FSFLWNO = req.getParameter("fsflwno");
        String PPFLWNO = req.getParameter("ppflwno");
        String CSTNO = req.getParameter("cstno");
        String PRONO = req.getParameter("prono");
        String SALEAMT = req.getParameter("saleamt");
        String INVALIDDATE = req.getParameter("invaliddate");
        String ISCANTRADE = req.getParameter("iscantrade");

        ForSaleProduct forSaleProduct = null;
        //封装
        try {
            forSaleProduct = new ForSaleProduct(FSFLWNO,PPFLWNO,CSTNO,PRONO,Long.parseLong(SALEAMT),new SimpleDateFormat("yyyy-MM-dd").parse(INVALIDDATE),Boolean.parseBoolean(ISCANTRADE));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(forSaleProduct.toString());
        return forSaleProductService.forSaleProductInsert(forSaleProduct);
    }
}
