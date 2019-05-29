<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/4/6
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
       //更改权限

    $(function aa() {
        $.ajax({
            url: "${pageContext.request.contextPath }/science/All",
            type: "POST",
            dataType: 'json',
            data: {},
            success: function (data) {
                var result = "";

                $.each(data, function (i, el) {
                    result += "<tr>";
                    result += "<td>" + el.id + "</td>"
                    result += "<td>" + el.science + "</td>"
                    result += "<td>" + el.principal + "</td>"
                    result += "<td>" + el.phone + "</td>"
                    result += "<td>" + el.introducte + "</td>"
                    result += "<td>" + el.sex + "</td>"
                    result += "<td>" + el.ispass + "</td>"
                    result += "<td><a href='${pageContext.request.contextPath}/science/updatepower?id=" + el.id + "'>更改通过</a></td>"
                    result += "</tr>";
                });
                $("#list").html(result);
            },
            error: function () {
                alert("失败")
            },

        })
    });


</script>
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
                    <small>立项申请</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>立项名称</th>
                    <th>立项负责人</th>
                    <th>负责人电话</th>
                    <th>个人简历</th>
                    <th>性别</th>
                    <th>是否通过</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody id="list"></tbody>
            </table>

        </div>
    </div>
</div>
</body></html>