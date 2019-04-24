package com.example.hospital.service;

import com.example.hospital.pojo.HospitalProgammeT;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProgammeService
{
    int add(HospitalProgammeT progammeT);

    int updateById(HospitalProgammeT progammeT);

    int deleteById(HospitalProgammeT progammeT);

    HospitalProgammeT selectByPrimaryKey(Integer id);

    PageInfo<HospitalProgammeT> selectAll(Integer page, Integer pageSize);
}
