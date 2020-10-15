package com.cebbank.liuxiaoming.springboot.mapper;


import com.cebbank.liuxiaoming.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EmployeeMapper {

	  public List<Employee> emps();
	  public Employee queryEmpById(Integer id);
}
