package com.bit.motrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String test() {
        System.out.println("test");
        return "/WEB-INF/views/index";
    }

}