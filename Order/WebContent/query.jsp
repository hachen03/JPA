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
            <td  align=center>
            <table width=500 align=center border=0>
                   <tr align="center">
                   <td colspan=6>查詢條件<br>
                   <form action="query.jsp" method="post">
                                                 金額從
                   <input type="text" name="start" size=5>                                                   
                                                   到
                   <input type="text" name="end" size=5>
                   <input type="submit" value="查詢">
                   </form>
                   <tr>
                   <td colspan=6>
                   <hr>
                   <tr>
                   <td>id<td>desk<td>A<td>B<td>C<td>sum
                   <% 
                   String START=request.getParameter("start");
                   String END=request.getParameter("end");
                   if(START==null || START=="" || END==null || END=="")
                   {
                	   out.println(new porderDao().queryAll());
                   }
                   else
                   {
                	   int S=Integer.parseInt(START);
                	   int E=Integer.parseInt(END);
                	   out.println(new porderDao().querySum(S,E));
                   }
                   %>
            </table>
		<tr>
			<td height=50 align=center>
			<jsp:include page="end.jsp"/>
	</table>
</body>
</html>