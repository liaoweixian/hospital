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
import com.example.hospital.pojo.HospitalRoleT;
import com.example.hospital.service.HospitalRoleService;

@Controller
@RequestMapping("/role")
public class HospitalRoleController {


		@Autowired
		private HospitalRoleService hospitalRoleServiceImpl;
		
		@PostMapping("/register")
		public String userRegister(HttpServletRequest httpServletRequest,@ModelAttribute HospitalRoleT role) {
			System.out.println(role);
			hospitalRoleServiceImpl.insert(role);
			return "login";
		}

		@GetMapping("/checkName/{roleName}/{id}")
		@ResponseBody
		public boolean checkUserName(@PathVariable("roleName") String roleName,@PathVariable("id") String id) {
			HospitalRoleT role = null;
			if ( id != null )
			{
				role = hospitalRoleServiceImpl.selectIdByRoleName(Integer.parseInt(id),roleName);
				if (role == null)
				{
					role = hospitalRoleServiceImpl.selectByRoleName(roleName);
				}
				else
				{
					return false;
				}
			}
			else
			{
				System.out.println("------------------------------");
				role = hospitalRoleServiceImpl.selectByRoleName(roleName);
			}
			if(role != null) {
				return true;
			}else {
				return false;
			}
		}

		@GetMapping("/checkName/{roleName}")
		@ResponseBody
		public boolean checkUserName(@PathVariable("roleName") String roleName) {
			HospitalRoleT user = hospitalRoleServiceImpl.selectByRoleName(roleName);
			if(user != null) {
				return true;
			}else {
				return false;
			}
		}
/**		
		@RequestMapping("/land")
		@ResponseBody
		public ResposeStatus userLand(HospitalRoleT user,HttpServletRequest httpServletRequest) {
			ResposeStatus resposeStatus = new ResposeStatus();
			HospitalRoleT resultUser = hospitalRoleServiceImpl.userLand(user);
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
		*/
		@RequestMapping
		    public HospitalRoleT addStudent(HospitalRoleT role, BindingResult bindingResult){
		        if(bindingResult.hasErrors()){
		             return null;
		        }
		        role.setRoleName(role.getRoleName());
		
				return role;
		    }
	}


