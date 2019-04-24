package com.example.hospital.controller;

import com.example.hospital.pojo.HospitalProgammeT;
import com.example.hospital.service.ProgammeService;
import com.example.hospital.utils.ConstantDefault;
import com.example.hospital.utils.ResponeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/progamme")
public class ProgammeController
{

    @Autowired
    private ProgammeService progammeServiceImpl;

    @RequestMapping(value = "/add")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> add(@ModelAttribute HospitalProgammeT progammeT)
    {
        if (progammeT.getProgrammePushContent().length() == 0 || progammeT.getProgrammePushContent() == null)
        {
            return ResponeUtils.result(ConstantDefault.RESULT_ERROR, "请填写推送内容", HttpStatus.OK);
        }

        int result = progammeServiceImpl.add(progammeT);
        if (result > 0)
        {
            return ResponeUtils.result(ConstantDefault.RESULT_SUCCESS, "保存成功", HttpStatus.OK);
        }

        return ResponeUtils.result(ConstantDefault.RESULT_ERROR, "保存失败，请重试", HttpStatus.OK);
    }


    @RequestMapping(value = "/update")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> update(@ModelAttribute HospitalProgammeT progammeT)
    {
        if (progammeT.getId() == null || progammeT.getId() <=0)
        {
            return ResponeUtils.result(ConstantDefault.RESULT_ERROR, "数据提交错误", HttpStatus.OK);
        }

        int result = progammeServiceImpl.updateById(progammeT);

        return ResponeUtils.result(ConstantDefault.RESULT_SUCCESS, "保存成功", HttpStatus.OK);
    }


    @RequestMapping(value = "/del/{id}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> del(@PathVariable("id") Integer id)
    {
        HospitalProgammeT hospitalProgammeT = progammeServiceImpl.selectByPrimaryKey(id);
        if (hospitalProgammeT == null)
        {
            return ResponeUtils.result(ConstantDefault.RESULT_ERROR, "数据不存在或已经被删除", HttpStatus.OK);
        }
        int result = progammeServiceImpl.deleteById(hospitalProgammeT);
        return ResponeUtils.result(ConstantDefault.RESULT_SUCCESS, "删除成功", HttpStatus.OK);
    }
}
