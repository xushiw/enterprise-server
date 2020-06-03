package com.shiw.enterpriseusercenter.service.impl;

import com.shiw.enterpriseusercenter.dao.EmployeeMapper;
import com.shiw.enterpriseusercenter.model.Employee;
import com.shiw.enterpriseusercenter.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAllByName() {
        return employeeMapper.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeMapper.findById(id).get();
    }

    @Override
    @Transactional
    public Employee addEmployee(Employee emp) {
        return employeeMapper.save(emp);
    }

    @Override
    @Transactional
    public int delEmployee(Long id) {
        employeeMapper.deleteById(id.longValue());
        return (int) employeeMapper.count();
    }

}
