<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.porderDao"
    %>
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
			<td align=center>
			<table width=500 align="center" border=0>
			       <tr align="center">
			       <td colspan=6>修改條件<br>
			       <form action="updateController" method="post">
			       id
			       <input type="text" name="id" size=5>
			                 桌號:
			         <select name="desk">
			         <option value="A">A
			         <option value="B">B
			         <option value="C">C
			         <option value="D">D
			         <option value="E">E
			         </select>
			         A<input type="text" name="A" size=5>
			         B<input type="text" name="B" size=5>
			         C<input type="text" name="C" size=5>
			         <input type="submit" value="修改">		       
			      </form>
			      <tr>
			         <td colspan=6>
			         <hr>
			        <tr>
			        <td>id<td>desk<td>A<td>B<td>C<td>sum
			        <%
			              out.println(new porderDao().queryAll());
			        %>
			</table>
             
		<tr>
			<td height=50 align=center>
			<jsp:include page="end.jsp"/>
	</table>
</body>
</html>