package com.example.hospital.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@PostMapping("add")
	@ResponseBody
    public int addUser(HttpServletRequest httpServletRequest,@ModelAttribute HospitalUserT record) {
		System.out.println(444);
		if(record != null) {
			System.out.println(record);
			record.setDataState(new Byte("1"));
			 hospitalUserServiceImpl.insert(record);
		}
		return 0;
	}
	
	@GetMapping("update")
	@ResponseBody
	public int updateUser(HospitalUserT record) {
		System.out.println("修改");
		return hospitalUserServiceImpl.updateByPrimaryKey(record);

	}
}
