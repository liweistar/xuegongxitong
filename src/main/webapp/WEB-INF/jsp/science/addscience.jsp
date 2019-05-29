<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/4/7
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>立项申请</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>

                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>立项申请</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/science/addscience" name="userForm" method="post">
        立项名称：<input type="text" name="science" /><br><br><br>
        立项负责人：<input type="text" name="principal" value="${c.science}"/><br><br><br>
        负责人电话：<input type="text" name="phone" value="${c.phone}"/><br><br><br>
        性别：<input type="text" name="sex" value="${c.sex}"/> <br><br><br>
        个人简历：<textarea name="introducte"></textarea><br><br><br>

        <input class="btn btn-primary" type="submit" value="添加" >
    </form>

</div>