<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>校园相册</title>
<link rel="stylesheet" href="../layuiadmin/layui/css/layui.css"
	media="all">
<link rel="stylesheet" href="../layuiadmin/style/admin.css" media="all">
<style type="text/css"> 
.layui-table-cell{
	height:auto!important;
	white-space:normal;
}
 
</style> 
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
							<div class="layui-upload">
								  <button type="button" class="layui-btn" id="test1"><i class="layui-icon">&#xe67c;</i>上传图片</button>
								  <div class="layui-upload-list">
								    <img class="layui-upload-img" id="demo1">
								    <p id="demoText"></p>
								  </div>
							</div> 
						</div>

						<table class="layui-hide" id="test-table-operate"
							lay-filter="test-table-operate">
							<thead>
							    <tr>
							      <th lay-data="{field:'photoid'">ID</th>
							      <th lay-data="{field:'photo'">photo</th>
							    </tr>
							</thead>
						</table>

						<script type="text/html" id="test-table-operate-barDemo">
              <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del"><i class="layui-icon">&#xe640;</i>删除</a>
            </script>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="../layuiadmin/layui/layui.js"></script>
	<script type="text/html" id="imgtmp">
		<img src="{{d.photo}}">
	</script>
	<script>
		layui
				.config({
					base : '../layuiadmin/' //静态资源所在路径
				})
				.extend({
					index : 'lib/index' //主入口模块
				})
				.use(
						[ 'index', 'contlist', 'table','upload','laytpl' ],
						function() {
							var table = layui.table, admin = layui.admin, form = layui.form;
							var $ = layui.jquery,upload = layui.upload;
							var laytpl = layui.laytpl;

							//普通图片上传
							  var uploadInst = upload.render({
							    elem: '#test1'
							    ,url: 'insphoto'
							    ,before: function(obj){
							      //预读本地文件示例，不支持ie8
							      obj.preview(function(index, file, result){
							        $('#demo1').attr('src', result); //图片链接（base64）
							      });
							    }
							    /*,done: function(res){
							      //如果上传失败
							      if(res.code > 0){
							        return layer.msg('上传失败');
							      }
							      //上传成功
							    }*/
							    ,error: function(){
							      //演示失败状态，并实现重传
							      var demoText = $('#demoText');
							      demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
							      demoText.find('.demo-reload').on('click', function(){
							        uploadInst.upload();
							      });
							    }
							  });
							
							//监听工具条
							table.on('tool(test-table-operate)', function(obj) {
								var data = obj.data;
								if (obj.event === 'detail') {
									layer.msg('ID：' + data.photoid + ' 的查看操作');
								} else if (obj.event === 'del') {
									layer.confirm('真的删除行么', function(index) {
										obj.del();
										$.getJSON("delphoto", {
											"photoid" : data.photoid
											}, function(data) {
										})
										layer.close(index);
									});
								} 
							});


							//表格渲染
							table.render({
								elem : '#test-table-operate',
								url : 'showphoto',
								width : admin.screen() > 1 ? 892 : '',
								height : 332,
								cols : [ [ {
									field : 'photoid',
									width : 180,
									title : 'ID',
									sort : true,
									//fixed : 'left'
								}, {
									field : 'photo',
									width : 550,
									title : 'photo',
									templet : "#imgtmp"
								},  {
									width : 143,
									align : 'center',
									//fixed : 'right',
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