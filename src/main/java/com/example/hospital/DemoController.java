package com.example.hospital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DemoController {
    @RequestMapping("/index")
    public String index()
    {
        System.out.println("--------------");
        return "thymeleaf/exception";
    }

    @RequestMapping("/show-user")
    public String showUser(HttpServletRequest request, HttpServletResponse response) {

        return "thymeleaf/userList";
    }
}
