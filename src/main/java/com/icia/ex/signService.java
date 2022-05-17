package com.icia.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class signService {
    @Autowired
    signRepository topRepository;
    public void sign(String name1,String pass1){
        topRepository.sign(name1,pass1);
    }
}
