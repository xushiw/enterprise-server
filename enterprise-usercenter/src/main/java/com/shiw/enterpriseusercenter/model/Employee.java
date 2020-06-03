package com.shiw.enterpriseusercenter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Table(name="employee")
@Data
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Employee {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)  //全局生成
    private Long id;

    private String nikeName;

    private String realName;

    private Byte sex;

    private Integer age;

    private String cardNo;

    private String adress;

    private String email;

    private Date createTime;

    private Date updateTime;

}