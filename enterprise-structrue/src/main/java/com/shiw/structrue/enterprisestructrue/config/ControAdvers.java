package com.shiw.structrue.enterprisestructrue.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Configuration
public class ControAdvers {


    @ExceptionHandler(Exception.class)
    public void errorExceptionAccpter(){

        System.out.println("errorExceptionAccpter is running ....");

    }

}
