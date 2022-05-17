package com.icia.ex;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class signRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public void sign(String name1,String pass1){
        System.out.println("name1 = " + name1 + ", pass1 = " + pass1);
    sql.insert("Sign.save",name1);
    }
}
