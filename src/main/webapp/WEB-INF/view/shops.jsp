<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商铺列表</title>
<link rel="stylesheet" type="text/css" href="/resource/css/index2.css">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<script type="text/javascript">
function fenye(pageNum) {
	$("[name=pageNum]").val(pageNum);
	
	$("form").submit();
}


	function choose(own) {
		$("[name=check]").attr("checked",own.checked);
	}
	
	function add() {
		location.href="add";
	}
	
	
	
	
	
	
	function del() {
		var size = $("[name=check]:checked").length;
		console.log(size);
		if(size>1){
			var sids = $("[name=check]:checked").map(function(){
				return this.value;
			}).get().join();
			$.post("delete.do",{sids:sids},function(flag){
				if(flag){
					alert("删除成功！");
					location="/shops";
				}else{
					alert("删除失败！"); 
				}
			},"json")
		}else{
			if(size=0){
				alert("请选择要删除的记录");
			}else{
				alert("批删至少选择两条记录");
			}
			
		}
			alert(sids);
		}
</script>


<body>
<form>
	<input type="hidden" name="pageNum">
	店铺名称:<input type="text" name="name" value="${condition.name }">
	<button>查询</button>
	<button type="button" onclick="add()">添加</button>
	<button type="button" onclick="del()">批量删除</button>
</form>
<table>
	<tr>
	<td>
		<input type="checkbox" onclick="choose(this)">
	</td>
		<td>编号</td>
		<td>店铺名称</td>
		<td>创建日期</td>
		<td>销售商品</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${shops}" var="shop" varStatus="i">
		<tr>
		<td>
			<input type="checkbox" name="check" value="${shop.id }">
		</td>
			<td>${ i.count}</td>
			<td>${shop.name }</td>
			<td>
			<fmt:formatDate value="${shop.created }" pattern="yyyy-MM-dd"/>
			</td>
			<td>
				<c:forEach items="${shop.goods }" var="good">
					${good.name }
				</c:forEach>
			</td>
			<td><a href="/detail?id=${shop.id }">详情</a></td>
		</tr>
	</c:forEach>
		<tr>
		<td colspan="10">
			<button onclick="fenye(1)">首页</button>
			<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
			<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
			<button onclick="fenye(${page.pages})">尾页</button>
			第${page.pageNum}/${page.pages}页,共${page.total}条
		</td>
	</tr>
</table>
</body>
</html>