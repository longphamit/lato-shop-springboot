package com.fptu.latoshopspringboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        System.out.println("hello");
        return "admin/home/index";
    }
}
