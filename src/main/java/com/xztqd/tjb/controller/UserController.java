package com.xztqd.tjb.controller;

import com.alibaba.fastjson.JSON;
import com.xztqd.tjb.po.ErrorMsg;
import com.xztqd.tjb.po.User;
import com.xztqd.tjb.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    //selectUserPassword
    @RequestMapping(value = "getPassword",method = RequestMethod.POST)
    public Object selectUserPassword(HttpServletRequest req, HttpServletResponse resp){
        String userid = req.getParameter("userid");
        String postpassword = req.getParameter("password");

        String password = null;
        password = userService.userSelectPassword(userid);


        ErrorMsg errorMsg = null;
        if (postpassword.equals(password)){
            errorMsg = new ErrorMsg("OK");
        }
        else if(password==null){
            errorMsg = new ErrorMsg("NO ACCOUNT");
        }else if(!postpassword.equals(password) && password!=null){
            errorMsg = new ErrorMsg("WRONG PASSWORD");
        }
        return JSON.toJSONString(errorMsg);
    }

}
