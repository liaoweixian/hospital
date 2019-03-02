package com.example.hospital.service;

import java.util.List;

import com.example.hospital.pojo.HospitalRoleT;


public interface HospitalRoleService {
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(HospitalRoleT record);
	
    int deleteByPrimaryKeys(List<Integer> list);
	
	HospitalRoleT selectByPrimaryKey(Integer id);
	
	List<HospitalRoleT> selectAll();
	
	int updateByPrimaryKey(HospitalRoleT record);
	
	HospitalRoleT selectByRoleName(String RoleName);

	HospitalRoleT selectIdByRoleName(Integer id, String roleName);
	
	List<HospitalRoleT> selectRoleSearch(HospitalRoleT hospitalRoleT);
	    
	List<HospitalRoleT> queryRolePage(int page,int rows);
	
	

}
