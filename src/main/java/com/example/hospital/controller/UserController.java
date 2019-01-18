package com.example.hospital.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
	
	@RequestMapping("update")
	@ResponseBody
	public int updateUser(HospitalUserT record,HttpServletRequest request) {
		System.out.println(record);
		/*HttpSession session = request.getSession();
		session.getAttribute("")*/
		HospitalUserT oldUser = hospitalUserServiceImpl.selectByPrimaryKey(record.getId());
		oldUser.setUserLoginName(record.getUserLoginName());
		oldUser.setUserSex(record.getUserSex());
		return hospitalUserServiceImpl.updateByPrimaryKey(oldUser);
		
	}

	@RequestMapping("user/{target_page}/{id}")
	public ModelAndView getUser(@PathVariable("target_page") String target_page,@PathVariable("id") String id,ModelAndView view)
	{
		HospitalUserT userInfo = hospitalUserServiceImpl.selectByPrimaryKey(Integer.parseInt(id));
		view.addObject("userInfo", userInfo);
		view.setViewName(target_page);
		return view;
	}
}
