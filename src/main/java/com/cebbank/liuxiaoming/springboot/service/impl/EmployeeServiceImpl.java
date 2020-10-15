package com.cebbank.liuxiaoming.springboot.service.impl;

import com.cebbank.liuxiaoming.springboot.bean.Employee;
import com.cebbank.liuxiaoming.springboot.mapper.EmployeeMapper;
import com.cebbank.liuxiaoming.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> emps() {
        return employeeMapper.emps();
    }

    @Override
    public Employee queryEmpById(Integer id) {
        return employeeMapper.queryEmpById(id);
    }
}
