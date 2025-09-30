package com.example.Spring_transactional.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

@Service
public class ServiceHelper {

    @Transactional(propagation = Propagation.NEVER)
    public void m1(){
        System.out.println("m1");
    }

}