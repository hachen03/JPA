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
            <form action="confirm.jsp" method="post">
            <table width=650 align=center border=1>
            <tr>
                <td colspan=3>
                                           桌號:
                <select name="desk">
                <option value="A">A
                <option value="B">B
                <option value="C">C
                <option value="D">D
                <option value="E">E
                </select>
            <tr>
                <td>
                A餐(120)<br>
                <img alt=1 src="pic\1.jpg" width=200><br>
                <select name="A">
			        <option value="0">0
			        <option value="1">1
			        <option value="2">2
			        <option value="3">3
			        <option value="4">4
			        <option value="5">5
			        <option value="6">6
			        <option value="7">7
			        <option value="8">8
			        <option value="9">9		        
			        </select>
			    <td>
			           B餐(135)<br>
			        <img alt="1" src="pic\2.jpg" width=200><br>
			        <select name="B">
			        <option value="0">0
			        <option value="1">1
			        <option value="2">2
			        <option value="3">3
			        <option value="4">4
			        <option value="5">5
			        <option value="6">6
			        <option value="7">7
			        <option value="8">8
			        <option value="9">9		        
			        </select>
			    <td>
			        C餐(150)<br>
			        <img alt="1" src="pic\3.jpg" width=200><br>
			        <select name="C">
			        <option value="0">0
			        <option value="1">1
			        <option value="2">2
			        <option value="3">3
			        <option value="4">4
			        <option value="5">5
			        <option value="6">6
			        <option value="7">7
			        <option value="8">8
			        <option value="9">9		        
			        </select>
			      <tr>
			        <td colspan=3 align=center>
			        <input type="submit" value=ok>
            </table>
            </form>
		<tr>
			<td height=50 align=center>
			<jsp:include page="end.jsp"/>
	</table>

</body>
</html>