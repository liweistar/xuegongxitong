<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/5/24
  Time: 23:04
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
    $(function () {
        $.post("selcontent", function (data) {
            var result = "";
            for (var i = 0; i < data.length; i++) {
                result += "<tr>";
                result += "<td>" + data[i].teaname+":" + "</id>";
                result += "<td>" + data[i].content + "</id>";
                result += "</tr>";
            }
            $("#mytbody").html(result);
        })
    })
</script>
<head>
    <title>教师反馈</title>
</head>
<body>
<form action="inscon" method="post">
<table class="table table-hover">
    <tr>
        <td>反馈信息：</td>
        <td><textarea class="form-control" rows="3" name="content"></textarea></td>
        <td><input type="submit" value="提交" id="sub" class="btn btn-primary"></td>
    </tr>

</table>
</form>
<table class="table table-hover">
    <tr>
        <td>教师姓名</td>
        <td>反馈内容</td>
    </tr>
    <tbody id="mytbody"></tbody>
</table>
</body>
</html>
