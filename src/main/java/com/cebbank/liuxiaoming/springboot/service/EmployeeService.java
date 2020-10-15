package com.cebbank.liuxiaoming.springboot.service;

import com.cebbank.liuxiaoming.springboot.bean.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> emps();
    public Employee queryEmpById(Integer id);
}
