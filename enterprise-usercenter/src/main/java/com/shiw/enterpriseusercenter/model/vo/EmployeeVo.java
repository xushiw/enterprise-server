package com.shiw.enterpriseusercenter.model.vo;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeVo {

    private String id;

    private String nikeName;

    private String realName;

    private Byte sex;

    private Integer age;

    private String cardNo;

    private String adress;

    private String email;

}
