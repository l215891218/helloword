package com.word.service;

import com.hello.entity.User;
import com.word.entity.Word;
import com.word.mapper.WordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class wordService {


    @Autowired
    private WordMapper helloMapper;

    public void index() {
        System.out.println("asddddddddddddddfasdf");
        List<User> list  = helloMapper.findSel();
        System.out.println(list);;
        List<User> listset  = helloMapper.find();
        System.out.println(listset);

    }


    @Transactional
    public void upd(Word word) {
        helloMapper.upd(word);

        word.setUserName("李伟4");
        upd1(word);
    }


    public void upd1(Word word) {
        helloMapper.upd(word);
    }
}
