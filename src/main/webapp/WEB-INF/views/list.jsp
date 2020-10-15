<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuxiaoming
  Date: 20/10/15
  Time: 下午2:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息</title>
</head>
<body>
    <table border="1" width="100%">
        <tr>
            <th>id</th>
            <th>last_name</th>
            <th>email</th>
            <th>gender</th>
            <th>删除</th>
            <th>修改</th>
        </tr>
        <c:forEach items="${emps}" var="emp">
            <tr>
                <th>${emp.id}</th>
                <th>${emp.lastName}</th>
                <th>${emp.email}</th>
                <th>${emp.gender}</th>
                <th>删除</th>
                <th>修改</th>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6"><h2 style="text-align: center"><a href="#">添加数据</a></h2></td>
        </tr>
    </table>
<h3 style="text-align: center;">${pageStr}</h3>
</body>
</html>
