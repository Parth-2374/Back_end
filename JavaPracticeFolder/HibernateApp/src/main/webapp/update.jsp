<%@page import="com.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
tr,td{
	padding: 10px
}
</style>
</head>
<body>
<% 
	Student s=(Student)request.getAttribute("s");
%>
<form action="StudentController" method="post" name="update">

<table>
<tr>
	<td><input type="hidden" name="id" value="<%=s.getId() %>" ></td>
</tr>
	<tr>
		<td>First name</td>
		<td><input type="text"name="fname" value="<%=s.getFname() %>"></td>
	</tr>
	<tr>
		<td>Last name</td>
		<td><input type="text"name="lname" value="<%=s.getLnmae() %>"></td>
	</tr>
	<tr>
		<td>Email ID</td>
		<td><input type="text"name="email" value="<%=s.getEmail() %>"></td>
	</tr>
	<tr>
		<td>Mobile No</td>
		<td><input type="text"name="mobile" value="<%=s.getMobile() %>"></td>
	</tr>
	<tr>
		<td colspan="2"align="center">
			<input type="submit" name="action" value="update">
		</td>
	</tr>
</table>
</form>
<a href="show.jsp" style="text-decoration: none; display:block; text-align: center; margin-top: 50px ;border: 2px solid black ;padding: 10px;" > Show All Student  </a>

</body>
</html>