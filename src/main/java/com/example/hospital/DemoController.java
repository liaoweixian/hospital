package com.example.hospital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD

@Controller
public class DemoController {
    @RequestMapping("/hospital")
    public String index()
    {
    	System.out.println("项目启动,,,,,,");
        return "index";
=======
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
>>>>>>> branch 'master' of https://github.com/liaoweixian/hospital.git
    }
}
