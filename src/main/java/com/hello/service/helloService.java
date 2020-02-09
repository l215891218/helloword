package com.hello.service;

import com.hello.entity.User;
import com.hello.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service
public class helloService {


    @Autowired
    private TransactionTemplate transactionTemplate;


    @Autowired
    private HelloMapper helloMapper;


    public void index() {
        System.out.println("asddddddddddddddfasdf");
        List<User> list  = helloMapper.findSel();
        System.out.println(list);;
        List<User> listset  = helloMapper.find();
        System.out.println(listset);
    }
}
