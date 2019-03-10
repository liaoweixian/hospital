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

import com.example.hospital.mapper.HospitalRoleTMapper;
import com.example.hospital.pojo.HospitalRoleT;
import com.example.hospital.service.HospitalRoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private HospitalRoleService hospitalRoleServiceImpl;
	
	@Resource
	private HospitalRoleTMapper hospitalRoleTMapper;
	
	@GetMapping("query")
	public ModelAndView queryRole() {
		ModelAndView view = new ModelAndView();
		view.addObject("userList", hospitalRoleServiceImpl.selectAll());
		view.setViewName("Role_management");
		return view;
	}

	@PostMapping("add")
	@ResponseBody
    public int addUser(HttpServletRequest httpServletRequest,@ModelAttribute HospitalRoleT record) {
		record.setDataState(new Byte("1"));
		return hospitalRoleServiceImpl.insert(record);
	}
	
	@DeleteMapping("delete/{id}")
	@ResponseBody
    public int delete(@PathVariable("id") Integer userId) {
		return hospitalRoleTMapper.deleteByPrimaryKey(userId);
	}
	
	@PostMapping("deleteAll")
	@ResponseBody
    public int deleteUser(@RequestParam(value = "ids") String ids)
	{
		List<Integer> list = new ArrayList<Integer>() ;
		String strArray[]  = ids.split(",");
		for (String str: strArray) {
			list.add(Integer.parseInt(str));
		}
		return hospitalRoleServiceImpl.deleteByPrimaryKeys(list);
	}
	
	@RequestMapping("update")
	@ResponseBody
	public int update(HospitalRoleT record,HttpServletRequest request) {
		HospitalRoleT oldRole = hospitalRoleTMapper.selectByPrimaryKey(record.getId());
		oldRole.setRoleName(record.getRoleName());
		return hospitalRoleTMapper.updateByPrimaryKey(oldRole);
	}

	@RequestMapping("role/{target_page}/{id}")
	public ModelAndView getRole(@PathVariable("target_page") String target_page,@PathVariable("id") Integer id,ModelAndView view)
	{
		HospitalRoleT roleInfo =  hospitalRoleTMapper.selectByPrimaryKey(id);
		view.addObject("roleInfo", roleInfo);
		view.setViewName(target_page);
		return view;
	}
	
	@GetMapping("userSearch")
	@ResponseBody
	public List<HospitalRoleT> userSearch(HospitalRoleT userIdcard){
		System.out.println(userIdcard);
		return null;
	}
	
	@GetMapping("userPage/{page}/{rows}")
	@ResponseBody
	public List<HospitalRoleT> userPage(@PathVariable("page") int page,@PathVariable("rows") int rows){
		return hospitalRoleServiceImpl.queryRolePage(page, rows);
	}

}
