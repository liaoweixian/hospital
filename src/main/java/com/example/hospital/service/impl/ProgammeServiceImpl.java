package com.example.hospital.service.impl;

import com.example.hospital.mapper.HospitalProgammeTMapper;
import com.example.hospital.pojo.HospitalProgammeT;
import com.example.hospital.service.ProgammeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProgammeServiceImpl implements ProgammeService
{

    @Resource
    private HospitalProgammeTMapper hospitalProgammeTMapper;

    @Override
    public int add(HospitalProgammeT progammeT)
    {
       return  hospitalProgammeTMapper.insert(progammeT);
    }

    @Override
    public int updateById(HospitalProgammeT progammeT)
    {
        return hospitalProgammeTMapper.updateByPrimaryKey(progammeT);
    }

    @Override
    public int deleteById(HospitalProgammeT progammeT)
    {
        return hospitalProgammeTMapper.deleteByPrimaryKey(progammeT.getId());
    }

    @Override
    public HospitalProgammeT selectByPrimaryKey(Integer id)
    {
        return hospitalProgammeTMapper.selectByPrimaryKey(id);
    }
}
