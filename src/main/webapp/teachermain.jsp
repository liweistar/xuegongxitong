<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/5/12
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<%--<link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">--%>
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<%--<script src="resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>--%>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
    $(function() {
            $.post("tcourse", function (data) {
                var result = "";
                for (var i = 0; i < data.length; i++) {
                    result += "<tr>";
                    result += "<td>" + data[i].course.coursecode + "</id>";
                    result += "<td>" + data[i].course.coursename + "</id>";
                    result += "<td>" + data[i].course.courselocaltion + "</id>";
                    result += "<td>" + data[i].course.coursetime + "</id>";
                    result += "<td>" + data[i].course.coursetype + "</id>";
                    result += "<td>" + data[i].course.selcount + "</id>";
                    result += "</tr>";
                }
                $("#mytbody").html(result);
            })
    })
</script>
<head>
    <title>Title</title>
</head>
<body>
<table class="table table-hover">
    <tr>
        <td>课程编码</td>
        <td>课程名称</td>
        <td>上课地点</td>
        <td>上课时间</td>
        <td>课程类型</td>
        <td>选课人数</td>
    </tr>
    <tbody id="mytbody"></tbody>
</table>
</body>
</html>
