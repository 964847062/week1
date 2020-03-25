<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/resource/css/index2.css">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<script type="text/javascript">
	$(function () {
		$.get("/selectGoods",{},function(goods){
			for(var i in goods){
				$("#goods").append("<input type='checkbox' name='gids' value='"+goods[i].id+"'/>"+goods[i].name+"");
			}
		})
	})

	function add() {
		$.post("/add",$("#form1").serialize(),function(flag){
			if(flag){
				alert("创建成功");
				location.href="/shops";
			}else{
				alert("创建失败");
			}
		})
	}
	
	function close() {
		location.href="/shops";
	}
</script>
<body>
<form id="form1">
		店铺名称:<input type="text" name="name"><br>
		创建日期:<input type="date" name="created"><br>
		销售商品:<span id="goods"></span><br>
		<button type="button" onclick="add()">保存</button>
		<button  type="button" onclick="close()">关闭</button>
		
</form>
</body>
</html>