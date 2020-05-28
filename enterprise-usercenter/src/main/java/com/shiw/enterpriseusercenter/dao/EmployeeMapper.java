package com.shiw.enterpriseusercenter.dao;

import com.shiw.enterpriseusercenter.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeMapper extends JpaRepository<Employee,Long> {

    //int deleteByPrimaryKey(Long id);

    //int insert(Employee record);

//    int insertSelective(Employee record);

  //  Employee selectByPrimaryKey(Long id);

    //int updateByPrimaryKeySelective(Employee record);

    //int updateByPrimaryKey(Employee record);

    //@Query("select a from Employee a where a.nickname like ?1 or a.realname like ?1")
    //List<Employee> findAllByName(String name);
}