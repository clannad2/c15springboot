package com.cebbank.liuxiaoming.springboot.controller;

import com.cebbank.liuxiaoming.springboot.bean.Employee;
import com.cebbank.liuxiaoming.springboot.service.EmployeeService;
import com.cebbank.liuxiaoming.springboot.util.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService es;

    @RequestMapping("/emps/{pageNum}")
    public String pageInfos(@PathVariable("pageNum") Integer pageNum, Map<String, Object> map, HttpServletRequest request){
        PageHelper.startPage(pageNum, 1);
        List<Employee> emps = es.emps();
        PageInfo<Employee> pageInfo=new PageInfo<>(emps, 5);//所有的分页信息
        String pageStr = PageUtil.getPageInfo(pageInfo,request);
        map.put("pageStr", pageStr);
        map.put("emps", emps);
        return "list";
    }
}
