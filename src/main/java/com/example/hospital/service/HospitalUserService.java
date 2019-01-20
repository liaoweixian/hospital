package com.example.hospital.service;

import java.util.List;

import com.example.hospital.pojo.HospitalUserT;

public interface HospitalUserService {
 
	
    int deleteByPrimaryKey(Integer id);
    
    int deleteByPrimaryKeys(List<Integer> list);

    Integer insert(HospitalUserT record);

    HospitalUserT selectByPrimaryKey(Integer id);

    List<HospitalUserT> selectAll();

    Integer updateByPrimaryKey(HospitalUserT record);
    
    HospitalUserT selectByUserName(String userName);
    
    HospitalUserT userLand(HospitalUserT record);

    HospitalUserT selectIdByUserName(Integer id,String userName);
    
    List<HospitalUserT> selectUserSearch(String userName,String userIdcard);
    
    List<HospitalUserT> queryUserPage(int page,int rows);
}
