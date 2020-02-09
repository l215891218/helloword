package com.hello.mapper;

import com.hello.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface HelloMapper {

    public List<User> find();

    @Select("select login_name from sys_user_t")
    public List<User> findSel();

}
