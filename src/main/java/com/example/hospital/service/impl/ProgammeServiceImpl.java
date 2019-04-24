package com.example.hospital.service.impl;

import com.example.hospital.mapper.HospitalProgammeTMapper;
import com.example.hospital.pojo.HospitalProgammeT;
import com.example.hospital.service.ProgammeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public PageInfo<HospitalProgammeT> selectAll(Integer page, Integer pageSize)
    {
        Page<Object> objects = PageHelper.startPage(page, pageSize, true);
        List<HospitalProgammeT> hospitalProgammeTS = hospitalProgammeTMapper.selectAll();
        PageInfo<HospitalProgammeT> pageInfo = new PageInfo<>(hospitalProgammeTS);
        return pageInfo;
    }
}
