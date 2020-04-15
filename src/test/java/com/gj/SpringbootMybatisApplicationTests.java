package com.gj;


import com.gj.domain.User;
import com.gj.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringbootMybatisApplicationTests {


    @Autowired
    UserMapper userMapper;

    @Test
    public void test01(){
        User user = userMapper.findById(1);

        System.out.println(user);
    }



}
