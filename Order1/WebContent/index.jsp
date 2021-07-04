<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<table width=750 align=center border=1>
		<tr>
			<td height=150 align=center>
			<jsp:include page="title.jsp"/>
		<tr>
			<td height=450 align=center>
			<a href="addOrder.jsp"1>點餐</a><br>
			<a href="query.jsp"2>查詢</a><br>
			<a href="update.jsp"3>修改</a><br>
			<a href="delete.jsp"4>刪除</a><br>
		<tr>
			<td height=50 align=center>
			<jsp:include page="end.jsp"/>
	</table>

</body>
</html>