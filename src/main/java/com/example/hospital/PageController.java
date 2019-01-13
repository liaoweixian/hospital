package com.example.hospital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("view/{id}")
    public String view (@PathVariable("id") String id)
    {
        return id;
    }
}
