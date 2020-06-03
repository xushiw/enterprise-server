package com.shiw.enterpriseusercenter.service;

import com.shiw.enterpriseusercenter.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAllByName();

    public Employee findById(Long id);

    public Employee addEmployee(Employee emp);

    public int delEmployee(Long id);

}
