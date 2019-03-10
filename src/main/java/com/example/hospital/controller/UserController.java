package com.example.hospital.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.hospital.mapper.HospitalUserTMapper;
import com.example.hospital.pojo.HospitalUserT;
import com.example.hospital.service.HospitalUserService;

@Controller
@RequestMapping("/userInfo")
public class UserController {

	@Autowired
	private HospitalUserService hospitalUserServiceImpl;
	
	@Resource
	private HospitalUserTMapper hospitalUserTMapper;
	
	@GetMapping("query")
	public ModelAndView queryUser(HospitalUserT hospitalUserT) {
		ModelAndView view = new ModelAndView();
		System.out.println(hospitalUserT.getUserIdcard());
		System.out.println(hospitalUserT.getUserName());
		List<HospitalUserT> userList = hospitalUserServiceImpl.selectUserSearch(hospitalUserT);
		hospitalUserT.setNumberPageCount(hospitalUserTMapper.selectUserCount(hospitalUserT));
		System.out.println(hospitalUserTMapper.selectUserCount(hospitalUserT));
		System.out.println(hospitalUserT.getNumberPageCount());
		view.addObject("userList", userList);
		view.addObject("search",hospitalUserT);
		view.setViewName("User_management");
		return view;
	}

	@PostMapping("add")
	@ResponseBody
    public int addUser(HttpServletRequest httpServletRequest,@ModelAttribute HospitalUserT record) {
		if(record != null) {
			System.out.println(record);
			record.setDataState(new Byte("1"));
			 hospitalUserServiceImpl.insert(record);
		}
		return 0;
	}
	
	@DeleteMapping("delete/{id}")
	@ResponseBody
    public int deleteUser(@PathVariable("id") Integer userId) {
		return hospitalUserServiceImpl.deleteByPrimaryKey(userId);
	}
	
	@PostMapping("deleteAll")
	@ResponseBody
    public int deleteUser(@RequestParam(value = "ids") String ids) {
		List<Integer> list = new ArrayList<Integer>() ;
		String string[]  = ids.split(",");
		System.out.println(string.length);
		for (int i = 0; i < string.length; i++) {
			
			list.add(Integer.parseInt(string[i]));
		}
		return hospitalUserServiceImpl.deleteByPrimaryKeys(list);
	}
	
	@RequestMapping("update")
	@ResponseBody
	public int updateUser(HospitalUserT record,HttpServletRequest request) {
		System.out.println(record);
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
	
	//@RequestParam(name="userName",required=false) String userName,@RequestParam(name="userIdcard",required=false) String userIdcard,@RequestParam(name="page",defaultValue="0") String page
	@GetMapping("userSearch")
	@ResponseBody
	public List<HospitalUserT> userSearch(HospitalUserT userIdcard){
		System.out.println(userIdcard);
		return null;
	}
	
	@GetMapping("userPage/{page}/{rows}")
	@ResponseBody
	public List<HospitalUserT> userPage(@PathVariable("page") int page,@PathVariable("rows") int rows){
		return hospitalUserServiceImpl.queryUserPage(page, rows);
	}
}
