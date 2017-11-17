package com.nianququye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nianququye.domain.PageBean;
import com.nianququye.domain.User;
import com.nianququye.service.UserService;

@Controller
public class UserController {
    @Autowired 
    UserService userService;
    
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "OK";
    }
    
    @RequestMapping("/getAllUser.do")
    String goGetAllUser() {
        return "/user/getAllUser.do";
    }
    
    
    @RequestMapping("/user/getAllUser.do")
    @ResponseBody
    PageBean<User> getAllUser(){
//        @RequestBody PageBean<User> pageBean
        PageBean<User> pageBean = new PageBean<>(0, 5);
        return userService.getAllUserByPaging(pageBean);
    }
}















