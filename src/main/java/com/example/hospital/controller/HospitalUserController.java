package com.example.hospital.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hospital.mapper.ResposeStatus;
import com.example.hospital.pojo.HospitalUserT;
import com.example.hospital.service.HospitalUserService;

@Controller
@RequestMapping("/user")
public class HospitalUserController {

	@Autowired
	private HospitalUserService hospitalUserServiceImpl;
	
	@PostMapping("/register")
	public String userRegister(HttpServletRequest httpServletRequest,@ModelAttribute HospitalUserT user) {
		System.out.println(user);
		hospitalUserServiceImpl.insert(user);
		return "login";
	}

	@GetMapping("/checkName/{userName}/{id}")
	@ResponseBody
	public boolean checkUserName(@PathVariable("userName") String userName,@PathVariable("id") String id) {
		HospitalUserT user = null;
		if ( id != null )
		{
			user = hospitalUserServiceImpl.selectIdByUserName(Integer.parseInt(id),userName);
			if (user == null)
			{
				user = hospitalUserServiceImpl.selectByUserName(userName);
			}
			else
			{
				return false;
			}
		}
		else
		{
			System.out.println("------------------------------");
			user = hospitalUserServiceImpl.selectByUserName(userName);
		}
		if(user != null) {
			return true;
		}else {
			return false;
		}
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
	
	@RequestMapping("/land")
	@ResponseBody
	public ResposeStatus userLand(HospitalUserT user,HttpServletRequest httpServletRequest) {
		ResposeStatus resposeStatus = new ResposeStatus();
		HospitalUserT resultUser = hospitalUserServiceImpl.userLand(user);
		if(resultUser != null) {
			HttpSession session = httpServletRequest.getSession();
			session.setAttribute("user", resultUser);
			session.setMaxInactiveInterval(60*60);
			System.out.println("登录成功！");
			resposeStatus.setStatus(1);
			resposeStatus.setData("登录成功");
		}else {
			resposeStatus.setMessage("登录失败");
			System.out.println("登录失败！");
		}
		return resposeStatus;
	}
	@RequestMapping
	    public HospitalUserT addStudent(HospitalUserT user, BindingResult bindingResult){
	        if(bindingResult.hasErrors()){
	             return null;
	        }
	        user.setUserLoginName(user.getUserName());
	
			return user;
	    }
}
