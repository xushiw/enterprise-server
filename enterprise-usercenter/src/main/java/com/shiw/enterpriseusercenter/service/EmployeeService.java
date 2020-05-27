package com.shiw.enterpriseusercenter.service;

import com.shiw.enterpriseusercenter.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAllByName(String paramName);

    public Employee findById(Long id);

    public Employee addEmployee(Employee emp);

    public int delEmployee(Long id);

    public Employee updateEmployee(Employee emp);
}
