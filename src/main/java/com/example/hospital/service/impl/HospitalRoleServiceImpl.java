package com.example.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.mapper.HospitalRoleTMapper;
import com.example.hospital.pojo.HospitalRoleT;
import com.example.hospital.service.HospitalRoleService;

@Service
public class HospitalRoleServiceImpl implements HospitalRoleService{
	
	@Autowired
	private HospitalRoleTMapper hospitalRoleTMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(HospitalRoleT record) {
		return hospitalRoleTMapper.insert(record);
	}

	
	@Override
	public HospitalRoleT selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HospitalRoleT> selectAll() {
		return hospitalRoleTMapper.selectAll();
	}

	@Override
	public int updateByPrimaryKey(HospitalRoleT record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public HospitalRoleT selectByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public HospitalRoleT selectIdByRoleName(Integer id, String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<HospitalRoleT> selectRoleSearch(HospitalRoleT hospitalRoleT) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HospitalRoleT> queryRolePage(int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int deleteByPrimaryKeys(List<Integer> list) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "HospitalRoleServiceImpl [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}
