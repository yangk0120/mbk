package com.baizhi;

import com.baizhi.entity.Emp;
import com.baizhi.mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MbkApplicationTests {

    @Autowired
    EmpMapper empMapper;

    @Test
    public void contextLoads() {
        Emp emp = empMapper.selectByPrimaryKey(3);
        System.out.println(emp);
    }

}
