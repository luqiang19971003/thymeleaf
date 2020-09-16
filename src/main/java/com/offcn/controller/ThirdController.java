package com.offcn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThirdController {

    @GetMapping("/third")
    public String third(Model model){
        model.addAttribute("userName","张三");
        return "index2";
    }
}
