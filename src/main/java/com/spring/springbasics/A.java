package com.spring.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private B b;

    public void b1(){
        System.out.println(b.b());
    }
}
