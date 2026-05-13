<%@page import="org.hibernate.jpa.internal.ExceptionMapperLegacyJpaImpl"%>
<%@page import="com.bean.Employee"%>
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
 Employee e=(Employee)request.getAttribute("e");
%>
<form action="EmployeeController" method="post" name="update">
<table>
	<tr>
		<td>
			<input type="hidden" name="did" value="<%=e.getDid() %>">
		</td>
	</tr>
	<tr>
		<td>First name</td>
		<td><input type="text"name="fname" value="<%=e.getEinfo().getFname()%>"></td>
	</tr>
	<tr>
		<td>Last name</td>
		<td><input type="text"name="lname" value="<%=e.getEinfo().getLname()%>"></td>
	</tr>
	<tr>
		<td>Email ID</td>
		<td><input type="text"name="email" value="<%=e.getEinfo().getEmail()%>"></td>
	</tr>
	<tr>
		<td>Mobile No</td>
		<td><input type="text"name="mobile" value="<%=e.getEinfo().getMobile()%>"></td>
	</tr>
	<tr>
		<td>Department Name</td>
		<td><input type="text"name="dname" value="<%=e.getDnmae()%>"></td>
	</tr>
	<tr>
		<td>salary </td>
		<td><input type="text"name="salary" value="<%=e.getSalary()%>"></td>
	</tr>
	<tr>
		<td colspan="2"align="center">
			<input type="submit" name="action" value="update">
		</td>
	</tr>
</table>
</form>
<a href="show.jsp" style="text-decoration: none; display:block; text-align: center; margin-top: 50px ;border: 2px solid black ;padding: 10px;" > Show All Employee  </a>

</body>
</html>