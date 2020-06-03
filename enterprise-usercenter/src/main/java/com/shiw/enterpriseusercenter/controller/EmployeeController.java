package com.shiw.enterpriseusercenter.controller;


import com.shiw.enterpriseusercenter.model.Employee;
import com.shiw.enterpriseusercenter.model.vo.EmployeeVo;
import com.shiw.enterpriseusercenter.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
//@RequestMapping("/employee")
@Api(value = "Web-AuthRestController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class EmployeeController {

     @Autowired
     private EmployeeService employeeService;

     @GetMapping("/list")
     @ApiOperation(httpMethod = "GET", value = "查询所有用户信息")
     public List<Employee> findAllBy(){
         List<Employee> empList = new ArrayList<>();
         empList  = employeeService.findAllByName();
         return empList;
     }

     @GetMapping("/get/{id}")
//     @RequestMapping(value = "/get",method = RequestMethod.GET)
     @ApiOperation(httpMethod = "GET", value = "根据用户id查询用户信息")
     public Employee findById(@PathVariable("id") Integer id){
//     public Employee findById(@RequestParam("id") Integer id){
         System.out.println("id value : "+ id);
         Assert.notNull(id,"id不能为空");
         return employeeService.findById(id.longValue());
     }

     @PostMapping("/update")
     @ApiOperation(httpMethod = "POST", value = "新增或修改用户信息")
     public Employee saveEmp(@RequestBody EmployeeVo empVo){
         Employee emp = new Employee();
         if (!StringUtils.isEmpty(empVo.getId())) {
             emp = employeeService.findById(Long.parseLong(empVo.getId()));
             emp.setUpdateTime(new Date());
             BeanUtils.copyProperties(empVo,emp);
             employeeService.addEmployee(emp);
         }else{
             emp.setCreateTime(new Date());
             emp.setUpdateTime(new Date());
             BeanUtils.copyProperties(empVo,emp);
             employeeService.addEmployee(emp);
         }
         return emp;
     }

     @GetMapping("/delete/{id}")
     @ApiOperation(httpMethod = "GET", value = "根据用户id删除用户信息")
     public Integer deleteById(@PathVariable("id") Integer id){
         System.out.println("delete id value : "+id);
         return employeeService.delEmployee(id.longValue());
     }


}
