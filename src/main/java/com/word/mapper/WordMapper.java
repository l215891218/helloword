package com.word.mapper;

import com.hello.entity.User;
import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
import com.word.entity.Word;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface WordMapper {

    public List<User> find();

    @Select("select login_name from sys_user_t")
    public List<User> findSel();

    public void upd(Word word);

}
