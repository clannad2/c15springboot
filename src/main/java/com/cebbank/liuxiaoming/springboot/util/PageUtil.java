package com.cebbank.liuxiaoming.springboot.util;

import com.cebbank.liuxiaoming.springboot.bean.Employee;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * 分页
 */
public class PageUtil {

    public static String getPageInfo(PageInfo<Employee> pi,HttpServletRequest request ){
        //<a href="${pageContext.request.ContextPath}/emps/1">首页</a> <a href="emps/"+(pi.getPageNum-1)+"">上一页</a>
        String basePath=request.getContextPath()+"/";
        StringBuffer buffer=new StringBuffer();//可变长度的字符串
        //首页
        buffer.append("<a href='"+basePath+"emps/1'>首页</a>");
        buffer.append("&nbsp;&nbsp;");
        //上一页
        if(pi.isHasPreviousPage()) {
            buffer.append("<a href='"+basePath+"emps/"+(pi.getPageNum()-1)+"'>上一页</a>");
            buffer.append("&nbsp;&nbsp;");

        }else {
            buffer.append("上一页");
            buffer.append("&nbsp;&nbsp;");
        }

        //逻辑分页
        int[] navigatepageNums = pi.getNavigatepageNums();
        for (int i : navigatepageNums) {//i当前页码
            if(i==pi.getPageNum()) {
                buffer.append("<a style='color:green' href='"+basePath+"emps/"+i+"'>"+i+"</a>");
                buffer.append("&nbsp;&nbsp;");

            }else {

                buffer.append("<a href='"+basePath+"emps/"+i+"'>"+i+"</a>");
                buffer.append("&nbsp;&nbsp;");
            }
        }

        //下一页
        if(pi.isHasNextPage()) {
            buffer.append("<a href='"+basePath+"emps/"+(pi.getPageNum()+1)+"'>下一页</a>");
            buffer.append("&nbsp;&nbsp;");

        }else {
            buffer.append("下一页");
            buffer.append("&nbsp;&nbsp;");
        }

        //末页
        buffer.append("<a href='"+basePath+"emps/"+pi.getPages()+"'>末页</a>");
        buffer.append("&nbsp;&nbsp;");

        return  buffer.toString();
    }
}
