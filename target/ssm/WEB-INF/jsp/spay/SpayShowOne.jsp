<%--
  Created by IntelliJ IDEA.
  User: EGO
  Date: 2019/5/29
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>缴费模块</title>
</head>
<body><table border="1">
    <thead>
    <tr>
        <td>编号</td>
        <td>学号</td>
        <td>姓名</td>
        <td>学费</td>
        <td>缴费状态</td>
        <td>住宿费</td>
        <td>缴费状态</td>

    </tr>
    </thead>




    <tr>
        <td>${spay1.get(0).id}</td>
        <td>${spay1.get(0).studentid}</td>
        <td>${spay1.get(0).studentname}</td>
        <td>${spay1.get(0).tution}</td>
        <td>${spay1.get(0).tstate}</td>
        <td>${spay1.get(0).accex}</td>
        <td>${spay1.get(0).astate}</td>

    </tr>

</table>
</body>
</html>
