<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<link href="st.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="title"><jsp:include page="title.jsp"/></div>
<div id="content" align="center">
<%=application.getAttribute("A") %>
<form action="loginServlet" method="post">
�b��:<input type="text" name="username"><br>
�K�X:<input type="password" name="password"><br>
<input type="submit" value="����">
</form>
</div>
<div id="end"><jsp:include page="end.jsp"/></div>

</body>
</html>