<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.porderDao"
    import="Model.porder"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<%
porder p=(porder)session.getAttribute("P");
%>
<body>
<table width=750 align=center border=1>
		<tr>
			<td height=150 align=center>
			<jsp:include page="title.jsp"/>
		<tr>
			<td height=450 align=center>
			<table width=400 align=center border=1>
				<tr>
					<td colspan=2 align=center>
					<h3>訂單完成</h3>這是你的點餐細目
				<tr>
					<td width=100>桌號
					<td><%=p.getDesk() %>
				<tr>
					<td>A餐
					<td><%=p.getA() %>
				<tr>
					<td>B餐
					<td><%=p.getB() %>
				<tr>
					<td>C餐
					<td><%=p.getC() %>
				<tr>
					<td>共
					<td><%=p.getSum() %>元
				<tr>
					<td colspan=2 align=center>
					<a href="addOrder.jsp">重新點餐</a>
					<DIV ALIGN="CENTER">
						<FORM>
						<INPUT NAME="print" TYPE="button" VALUE="列印此頁"
						ONCLICK="varitext()">
						</FORM>
					</DIV>
			</table>
				
		<tr>
			<td height=50 align=center>
			<jsp:include page="end.jsp"/>
	</table>
</body>
</html>