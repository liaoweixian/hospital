package com.example.hospital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("/hospital")
    public String index()
    {
        System.out.println("项目启动--------------");
        return "index";
    }
}
