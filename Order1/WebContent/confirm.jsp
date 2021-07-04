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
String Desk=request.getParameter("desk");
int A=Integer.parseInt(request.getParameter("A"));
int B=Integer.parseInt(request.getParameter("B"));
int C=Integer.parseInt(request.getParameter("C"));
porder p=new porder(Desk,A,B,C);
session.setAttribute("P",p);
%>
<body>
<table width=750 align=center border=1>
		<tr>
			<td height=150 align=center>
			<jsp:include page="title.jsp"/>
		<tr>
			<td height=450 align=center>
			<table width=400 align="center" border=1>
			            <td colspan=2>
			            <h3>訂單完成</h3>這是你的點餐細目
			    <tr>
			         <td width=100>桌號
			         <td><%=p.getDesk()%>
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
				    <td colspan=2 align="center">
				    <a href="addOrder.jsp">重新點餐</a>
				    <a href="addOrderController">確定</a>	
			</table>
		<tr>
			<td height=50 align=center>
			<jsp:include page="end.jsp"/>
	</table>
</body>
</html>