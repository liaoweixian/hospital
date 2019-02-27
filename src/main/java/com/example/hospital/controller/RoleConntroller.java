package com.example.hospital.controller;

import java.util.ArrayList;
import java.util.List;

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
@RequestMapping("/userInfo")
public class RoleConntroller {
	@Autowired
	private HospitalRoleService hospitalRoleServiceImpl;
	
	@Autowired
	private HospitalRoleTMapper hospitalRoleTMapper;
	
	@GetMapping("query")
	public ModelAndView queryRole(HospitalRoleT hospitalRoleT) {
		ModelAndView view = new ModelAndView();
		List<HospitalRoleT> userList = hospitalRoleServiceImpl.selectRoleSearch(hospitalRoleT);
		
		//查询角色的数量
		/**
		 * hospitalRoleTMapper.setNumberPageCount(hospitalRoleTMapper.selectRoleCount(hospitalRoleT));
		 */
		
		System.out.println(hospitalRoleTMapper.selectRoleCount(hospitalRoleT));
		//System.out.println(hospitalRoleT.getNumberPageCount());
		view.addObject("userList", userList);
		view.addObject("search",hospitalRoleT);
		view.setViewName("Role_management");
		return view;
	}

	@PostMapping("add")
	@ResponseBody
    public int addUser(HttpServletRequest httpServletRequest,@ModelAttribute HospitalRoleT record) {
		if(record != null) {
			System.out.println(record);
			record.setDataState(new Byte("1"));
			hospitalRoleServiceImpl.insert(record);
		}
		return 0;
	}
	
	@DeleteMapping("delete/{id}")
	@ResponseBody
    public int deleteUser(@PathVariable("id") Integer userId) {
		return hospitalRoleServiceImpl.deleteByPrimaryKey(userId);
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
		return hospitalRoleServiceImpl.deleteByPrimaryKeys(list);
	}
	
	@RequestMapping("update")
	@ResponseBody
	public int updateUser(HospitalRoleT record,HttpServletRequest request) {
		System.out.println(record);
		/*HttpSession session = request.getSession();
		session.getAttribute("")*/
		HospitalRoleT oldUser = hospitalRoleServiceImpl.selectByPrimaryKey(record.getId());
		oldUser.setRoleName(record.getRoleName());
		return hospitalRoleServiceImpl.updateByPrimaryKey(oldUser);
		
	}

	@RequestMapping("role/{target_page}/{id}")
	public ModelAndView getRole(@PathVariable("target_page") String target_page,@PathVariable("id") String id,ModelAndView view)
	{
		HospitalRoleT userInfo = hospitalRoleServiceImpl.selectByPrimaryKey(Integer.parseInt(id));
		view.addObject("userInfo", userInfo);
		view.setViewName(target_page);
		return view;
	}
	
	//@RequestParam(name="userName",required=false) String userName,@RequestParam(name="userIdcard",required=false) String userIdcard,@RequestParam(name="page",defaultValue="0") String page
	@GetMapping("userSearch")
	@ResponseBody
	public List<HospitalRoleT> userSearch(HospitalRoleT userIdcard){
		System.out.println(userIdcard);
		return null;
		/*Integer count =  hospitalUserTMapper.selectUserCount();
		List<HospitalUserT> userList = hospitalUserServiceImpl.selectUserSearch(userName, userIdcard);*/
		
		//return hospitalUserServiceImpl.selectUserSearch(userName, userIdcard);
	}
	
	@GetMapping("userPage/{page}/{rows}")
	@ResponseBody
	public List<HospitalRoleT> userPage(@PathVariable("page") int page,@PathVariable("rows") int rows){
		return hospitalRoleServiceImpl.queryRolePage(page, rows);
	}

}
