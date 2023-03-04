package com.jwd36.spboot.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/create")
    public String userCreateGet(){
        return "/user/create";
    }
}
