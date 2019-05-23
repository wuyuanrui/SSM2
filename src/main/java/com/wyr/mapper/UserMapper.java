package com.wyr.mapper;

import com.wyr.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /*传递集合*/
    List<User> listu(List list);
    /*传递对象*/
    int add( User user);
    /*传递多个值*/
    int addParam(String name, String sex);
    /*传递多个值*/
    int addMap(List list);

    /*模糊查询*/
    List seclctlike(String uname);
}
