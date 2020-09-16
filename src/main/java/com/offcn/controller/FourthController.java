package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FourthController {

    @GetMapping("/fourth")
    public String fourth(Model model){
        model.addAttribute("flag", "yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");
        return "index3";
    }
}
