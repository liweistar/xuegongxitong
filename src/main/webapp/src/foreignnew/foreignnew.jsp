<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>外企公告数据操作</title>
<link rel="stylesheet" href="../layuiadmin/layui/css/layui.css"
	media="all">
<link rel="stylesheet" href="../layuiadmin/style/admin.css" media="all">
</head>
<body>

	<div class="layui-card layadmin-header">
		<div class="layui-breadcrumb" lay-filter="breadcrumb">
			<a lay-href="">主页</a> <a><cite>组件</cite></a> <a><cite>数据表格</cite></a>
			<a><cite>数据操作</cite></a>
		</div>
	</div>

	<div class="layui-fluid">
		<div class="layui-row layui-col-space15">
			<div class="layui-col-md12">
				<div class="layui-card">
					<div class="layui-card-header">数据操作</div>
					<div class="layui-card-body">
						<div class="layui-btn-group test-table-operate-btn"
							style="margin-bottom: 10px;">
							<button class="layui-btn layui-btn-warm layuiadmin-btn-list"
								data-type="add">
								<i class="layui-icon">&#xe654;</i>添加公告
							</button>
						</div>

						<table class="layui-hide" id="test-table-operate"
							lay-filter="test-table-operate">
							<thead>
							    <tr>
							      <th lay-data="{field:'foreignnid'">ID</th>
							      <th lay-data="{field:'foreignnewtitle'">标题</th>
							      <th lay-data="{field:'foreignnewcontent'">内容</th>
							    </tr>
							</thead>
						</table>

						<script type="text/html" id="test-table-operate-barDemo">
              <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
              <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
              <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
            </script>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="../layuiadmin/layui/layui.js"></script>
	<script>
		layui
				.config({
					base : '../layuiadmin/' //静态资源所在路径
				})
				.extend({
					index : 'lib/index' //主入口模块
				})
				.use(
						[ 'index', 'contlist', 'table' ],
						function() {
							var table = layui.table, admin = layui.admin, form = layui.form;

							//监听工具条
							table.on('tool(test-table-operate)', function(obj) {
								var data = obj.data;
								if (obj.event === 'detail') {
									layer.msg('ID：' + data.foreignnid + ' 的查看操作');
								} else if (obj.event === 'del') {
									layer.confirm('真的删除行么', function(index) {
										obj.del();
										$.getJSON("delforeignnew", {
											"foreignnid" : data.foreignnid
											}, function(data) {
										})
										layer.close(index);
									});
								} else if (obj.event === 'edit') {
											layer
											.open({
												type : 2,
												title : '修改公告',
												content : 'listform1.jsp?foreignnid='+data.foreignnid+'',
												maxmin : true,
												area : [ '550px', '550px' ],
												btn : [ '确定', '取消' ],
												yes : function(index, layero) {
													//点击确认触发 iframe 内容中的按钮提交
													var submit = layero
															.find('iframe')
															.contents()
															.find(
																	"#layuiadmin-app-form-submit");
													submit.click();
												}
											});
								}
							});

							var $ = layui.$, active = {
								batchdel : function() {
									var checkStatus = table
											.checkStatus('test-table-operate'), checkData = checkStatus.data; //得到选中的数据

									if (checkData.length === 0) {
										return layer.msg('请选择数据');
									}

									layer.confirm('确定删除吗？', function(index) {

										//执行 Ajax 后重载
										/*
										admin.req({
										  url: 'xxx'
										  //,……
										});
										 */
										table.reload('test-table-operate');
										layer.msg('已删除');
									});
								},
								add : function() {
									layer
											.open({
												type : 2,
												title : '添加公告',
												content : 'listform.jsp',
												maxmin : true,
												area : [ '550px', '550px' ],
												btn : [ '确定', '取消' ],
												yes : function(index, layero) {
													//点击确认触发 iframe 内容中的按钮提交
													var submit = layero
															.find('iframe')
															.contents()
															.find(
																	"#layuiadmin-app-form-submit");
													submit.click();
												}
											});
								}

							};

							//表格渲染
							table.render({
								elem : '#test-table-operate',
								url : 'showforeignnew',
								width : admin.screen() > 1 ? 892 : '',
								height : 332,
								cols : [ [ {
									field : 'foreignnid',
									width : 80,
									title : 'ID',
									sort : true,
									fixed : 'left'
								}, {
									field : 'foreignnewtitle',
									width : 220,
									title : '标题'
								}, {
									field : 'foreignnewcontent',
									width : 390,
									title : '内容',
								}, {
									width : 180,
									align : 'center',
									fixed : 'right',
									toolbar : '#test-table-operate-barDemo'
								} ] ],
							});

							$('.layui-btn.layuiadmin-btn-list').on(
									'click',
									function() {
										var type = $(this).data('type');
										active[type] ? active[type].call(this)
												: '';
									});

						});
	</script>
</body>
</html>