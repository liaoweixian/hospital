package com.example.hospital.service;

import java.util.List;

import com.example.hospital.pojo.HospitalUserT;

public interface HospitalUserService {
 
	
    int deleteByPrimaryKey(Integer id);

    Integer insert(HospitalUserT record);

    HospitalUserT selectByPrimaryKey(Integer id);

    List<HospitalUserT> selectAll();

    Integer updateByPrimaryKey(HospitalUserT record);
    
    HospitalUserT selectByUserName(String userName);
    
    HospitalUserT userLand(HospitalUserT record);


}
