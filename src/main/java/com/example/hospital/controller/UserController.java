package com.example.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.hospital.pojo.HospitalUserT;
import com.example.hospital.service.HospitalUserService;

@Controller
@RequestMapping("/userInfo")
public class UserController {

	@Autowired
	private HospitalUserService hospitalUserServiceImpl;
	
	@GetMapping("query")
	public ModelAndView queryUser() {
		ModelAndView view = new ModelAndView();
		List<HospitalUserT> userList = hospitalUserServiceImpl.selectAll();
		view.addObject("userList", userList);
		view.setViewName("User_management");
		return view;
	}
	


}
