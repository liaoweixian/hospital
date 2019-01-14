package com.example.hospital.service;

import java.util.List;

import com.example.hospital.pojo.HospitalUserT;

public interface HospitalUserService {
 
	
    int deleteByPrimaryKey(Integer id);

    int insert(HospitalUserT record);

    HospitalUserT selectByPrimaryKey(Integer id);

    List<HospitalUserT> selectAll();

    int updateByPrimaryKey(HospitalUserT record);
    
    HospitalUserT selectByUserName(String userName);
    
    HospitalUserT userLand(HospitalUserT record);


}
