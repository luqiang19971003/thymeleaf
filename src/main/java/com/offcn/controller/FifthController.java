package com.offcn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class FifthController {

    @GetMapping("/fifth")
    public String indexPage(Model model) {
        //日期时间
        Date date = new Date();
        model.addAttribute("date", date);
        //小数的金额
        double price=128.5648D;

        model.addAttribute("price", price);

        //定义大文本数据
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，" +
                "能够处理HTML，XML，JavaScript，CSS甚至纯文本。";

        model.addAttribute("strText", str);

        //定义字符串
        String str2="JAVA-offcn";
        model.addAttribute("str2", str2);

        return "index4";
    }
}
