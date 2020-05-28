package com.shiw.enterpriseusercenter.controller;


import com.shiw.enterpriseusercenter.model.Employee;
import com.shiw.enterpriseusercenter.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
@Api(value = "Web-AuthRestController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class EmployeeController {

     @Autowired
     private EmployeeService employeeService;

//     @GetMapping("/list/{name}")
//     public List<Employee> findAllBy(@PathVariable String name){
//         List<Employee> empList = new ArrayList<>();
//         empList  = employeeService.findAllByName(name);
//         return empList;
//     }

       @GetMapping("/get/{id}")
       @ApiOperation(httpMethod = "GET", value = "根据用户id查询用户信息")
       public Employee findById(@PathVariable Integer id){
//           Assert.isNull(id,"id不能为空");
//           return employeeService.findById(id.longValue());
           return null;
       }


}
