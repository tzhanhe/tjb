package com.xztqd.tjb.controller;


import com.alibaba.fastjson.JSON;
import com.xztqd.tjb.po.PersonProduct;
import com.xztqd.tjb.service.PersonProductService;
import com.xztqd.tjb.service.impl.PersonProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class PersonProductController {
    @Autowired
    private PersonProductService personProductService;

    //0insert
    @RequestMapping("/personProductInsert")
    public Object personProductInsert(HttpServletRequest req, HttpServletResponse resp){
        String ppflwno=req.getParameter("ppflwno");
        String cstno=req.getParameter("cstno");
        String prono=req.getParameter("prono");
        String buyamt=req.getParameter("buyamt");
        String buydate=req.getParameter("buydate");
        String enddate=req.getParameter("enddate");
        String prostate=req.getParameter("prostate");
        PersonProduct personProduct = null;
        try {
                    personProduct=new PersonProduct(ppflwno, cstno, prono,
                    Long.parseLong(buyamt),
                    new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(buydate),
                    new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(enddate),
                    Integer.parseInt(prostate)
                    );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personProductService.personProductInsert(personProduct);
    }

    //1delete
    @RequestMapping("/personProductDelete")
    public Object personProductDelete(HttpServletRequest req, HttpServletResponse resp){
        //接受
        String ppflwno=req.getParameter("ppflwno");
        PersonProduct personProduct=null;
        //处理
        return personProductService.personProductDelete(ppflwno);
    }

    //2update
    @RequestMapping("/personProductUpdate")
    public Object personProductUpdate(HttpServletRequest req, HttpServletResponse resp){
        //接受
        String prostate=req.getParameter("prostate");
        String ppflwno=req.getParameter("ppflwno");
        //处理
        PersonProduct personProduct=new PersonProduct();
        personProduct.setPpflwno(ppflwno);
        personProduct.setProstate(Integer.parseInt(prostate));

        return personProductService.personProductUpdate(personProduct);
    }

    @RequestMapping("/personProductSelectAll")
    public Object personProductSelectAll(HttpServletRequest req, HttpServletResponse resp){
        //接受
        String np=req.getParameter("np");
        String size=req.getParameter("size");
        PersonProduct personProduct=new PersonProduct();
        //处理
        return JSON.toJSONString(personProductService.personProductSelectAll(Integer.parseInt(np),Integer.parseInt(size)));
    }
}
