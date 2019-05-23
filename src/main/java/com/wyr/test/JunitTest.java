package com.wyr.test;


import com.wyr.mapper.UserMapper;
import com.wyr.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//测试类
@RunWith(SpringJUnit4ClassRunner.class)
//配置文件位置
@ContextConfiguration("classpath:applicationContext.xml")
public class JunitTest {
    @Autowired
    UserMapper userMapper;

    /*传递集合*/
    @Test
    public void test(){
        List li=new ArrayList();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);  li.add(5);  li.add(6);  li.add(7);
        List<User> users=userMapper.listu(li);
         for(User s:users){
             System.out.println(s.getUname()+s.getUsex()+s.getUid());
         }
    }

    /*传递对象*/
    @Test
    public void add(){
        User user=new User();
        user.setUname("吴远锐");
        user.setUsex("男");
       int users=userMapper.add(user);
        System.out.println(users);
        System.out.println(user.getUid());
    }

    /*普通传递多个参数*/
    @Test
    public void addPara(){
        String name="Tom";
        String sex="女";
        int i=userMapper.addParam(name,sex);
        System.out.println(i);
    }

    /*传递集合*/
    @Test
    public void addMap(){
        User user=new User();
        user.setUname("小吴");
        user.setUsex("男");
        User user1=new User();
        user.setUname("小天");
        user1.setUsex("女");
        List map=new ArrayList();
        map.add(user);
        map.add(user1);
        userMapper.addMap(map);
    }

    @Test
    public void like(){
        //String uname="R";
        List<User> users=userMapper.seclctlike(null);
        for(User u:users){
                System.out.println(u.getUname());
        }
    }
    
}
