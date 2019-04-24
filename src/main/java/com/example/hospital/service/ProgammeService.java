package com.example.hospital.service;

import com.example.hospital.pojo.HospitalProgammeT;

public interface ProgammeService
{
    int add(HospitalProgammeT progammeT);

    int updateById(HospitalProgammeT progammeT);

    int deleteById(HospitalProgammeT progammeT);

    HospitalProgammeT selectByPrimaryKey(Integer id);
}
