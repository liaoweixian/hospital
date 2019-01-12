package com.example.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HospitalUserController {

	@RequestMapping("/register")
	public String userRegister() {
		System.out.println(666);
		return "index";
	} 
}
