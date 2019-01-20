package com.example.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.mapper.HospitalUserTMapper;
import com.example.hospital.pojo.HospitalUserT;
import com.example.hospital.service.HospitalUserService;

@Service
public class HospitalUserServiceImpl implements HospitalUserService {

	@Autowired
	private HospitalUserTMapper hospitalUserTMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer userId) {
		return hospitalUserTMapper.deleteByPrimaryKey(userId);
	}
	
	@Override
	public int deleteByPrimaryKeys(List<Integer> list) {
		return hospitalUserTMapper.deleteByPrimaryKeys(list);
	}

	@Override
	public Integer insert(HospitalUserT record) {
		//判断用户是否已经被使用过
		String userLoginName = record.getUserLoginName();
		HospitalUserT user = hospitalUserTMapper.selectByUserName(userLoginName);
		if(user == null) {
			record.setDataState(new Byte("1"));
			return hospitalUserTMapper.insert(record);
		}
		return 0;
	}

	@Override
	public HospitalUserT selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return hospitalUserTMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<HospitalUserT> selectAll() {
		return hospitalUserTMapper.selectAll();
	}
	

	@Override
	public Integer updateByPrimaryKey(HospitalUserT record) {
	
			return hospitalUserTMapper.updateByPrimaryKey(record);
        
	}

	/**
	 * 根据用户名称查询用户信息
	 */
	@Override
	public HospitalUserT selectByUserName(String userName) {
		return hospitalUserTMapper.selectByUserName(userName);
	}

	@Override
	public HospitalUserT userLand(HospitalUserT record) {
		HospitalUserT user = hospitalUserTMapper.selectByUserName(record.getUserLoginName());
		if(user != null) {
			if(user.getUserPassword().equals(record.getUserPassword())) {
				return user;
			}else {
				return null;
			}
		}else {
			return null;
		}
	}

	@Override
	public HospitalUserT selectIdByUserName(Integer id, String userName) {
		HospitalUserT user = new HospitalUserT();
		user.setId(id);
		user.setUserLoginName(userName);
		HospitalUserT userT = hospitalUserTMapper.selectIdByUserName(user);
		return userT;
	}
	
	
	public List<HospitalUserT> selectUserSearch(HospitalUserT userIdcard) {
		return hospitalUserTMapper.selectUserSearch(userIdcard);
	}
	
	public List<HospitalUserT> queryUserPage(int page,int rows) {
		/*int count = hospitalUserTMapper.selectUserCount();
		HospitalUserT user = new HospitalUserT();
		
		user.setStartSize(rows*(page-1));//开始位置  page 第几页

		user.setEndSize(rows);//每页多少个
		return hospitalUserTMapper.selectUserByPaging(user);*/
		return null;
	}
}
