package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class EmpController {
    @Autowired
    EmpMapper empMapper;

    @RequestMapping("test")
    public Emp test() {
        return empMapper.selectByPrimaryKey(3);
    }

}
