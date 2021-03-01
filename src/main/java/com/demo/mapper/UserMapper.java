package com.demo.mapper;

import com.demo.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper{
    User selectByPrimaryKey(String id);

    User checkLogin(@Param("username") String username,@Param("password") String password);
}
