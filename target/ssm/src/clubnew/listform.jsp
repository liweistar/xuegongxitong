<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公告添加 iframe 框</title>
<link rel="stylesheet" href="../layuiadmin/layui/css/layui.css"
	media="all">
</head>
<body>

	<div class="layui-form" lay-filter="layuiadmin-app-form-list"
		id="layuiadmin-app-form-list" style="padding: 20px 30px 0 0;">
		<div class="layui-form-item">
			<label class="layui-form-label">公告标题</label>
			<div class="layui-input-inline">
				<input type="text" name="clubnewtitle" lay-verify="required"
					placeholder="请输入标题" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">公告内容</label>
			<div class="layui-input-inline">
				<textarea name="clubnewcontent" lay-verify="required"
					style="width: 400px; height: 150px;" autocomplete="off"
					class="layui-textarea"></textarea>
			</div>
		</div>
		<div class="layui-form-item layui-hide">
			<input type="button" lay-submit
				lay-filter="layuiadmin-app-form-submit"
				id="layuiadmin-app-form-submit" value="确认添加"> <input
				type="button" lay-submit lay-filter="layuiadmin-app-form-edit"
				id="layuiadmin-app-form-edit" value="确认编辑">
		</div>
	</div>

	<script src="../layuiadmin/layui/layui.js"></script>
	<script>
		layui.config({
			base : '../layuiadmin/' //静态资源所在路径
		}).extend({
			index : 'lib/index' //主入口模块
		}).use([ 'index', 'form' ], function() {
			var $ = layui.$, form = layui.form;

			//监听提交
			form.on('submit(layuiadmin-app-form-submit)', function(data) {
				var field = data.field; //获取提交的字段
				var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引  

				//提交 Ajax 成功后，关闭当前弹层并重载表格
				//$.ajax({});

				$.ajax({//异步请求返回给后台
					url : 'insclubnew',
					type : 'POST',
					data : {"clubnewtitle" : data.field.clubnewtitle,"clubnewcontent" : data.field.clubnewcontent},
					dataType : 'json',
					success : function(data) {
						//这里获取到数据执行显示
					}
				});
				parent.layui.table.reload('test-table-operate'); //重载表格
				parent.layer.close(index); //再执行关闭 
			});
		})
	</script>
</body>
</html>