package com.shiw.enterpriseusercenter.service.impl;

import com.shiw.enterpriseusercenter.dao.EmployeeMapper;
import com.shiw.enterpriseusercenter.model.Employee;
import com.shiw.enterpriseusercenter.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAllByName(String paramName) {
        return employeeMapper.findAllByName(paramName);
    }

    @Override
    public Employee findById(Long id) {
//        return employeeMapper.findById(id);
        return null;
    }

    @Override
    public Employee addEmployee(Employee emp) {
        return employeeMapper.save(emp);
    }

    @Override
    public int delEmployee(Long id) {
        return employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Employee updateEmployee(Employee emp) {
//        return employeeMapper.updateByPrimaryKeySelective(emp);
        return null;
    }
}
