package com.example.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hospital.pojo.HospitalUserT;
import com.example.hospital.service.HospitalUserService;

@Controller
@RequestMapping("/user")
public class HospitalUserController {

	@Autowired
	private HospitalUserService hospitalUserServiceImpl;
	
	@PostMapping("/register")
	public String userRegister(HospitalUserT user) {
		hospitalUserServiceImpl.insert(user);
		return "login";
	}
	
	@GetMapping("/checkName/{userName}")
	@ResponseBody
	public boolean checkUserName(@PathVariable("userName") String userName) {
		HospitalUserT user = hospitalUserServiceImpl.selectByUserName(userName);
		if(user != null) {
			return true;
		}else {
			return false;
		}
	}
	
	
	/*@RequestMapping("/land")
	public String userLand() {
		System.out.println(666);
		return "index";
	}*/
}
