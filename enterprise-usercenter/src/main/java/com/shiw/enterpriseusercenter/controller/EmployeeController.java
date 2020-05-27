package com.shiw.enterpriseusercenter.controller;


import com.shiw.enterpriseusercenter.model.Employee;
import com.shiw.enterpriseusercenter.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

     @Autowired
     private EmployeeService employeeService;

     @GetMapping("/list/{name}")
     public List<Employee> findAllBy(@PathVariable String name){
         List<Employee> empList = new ArrayList<>();
         empList  = employeeService.findAllByName(name);
         return empList;
     }




}
