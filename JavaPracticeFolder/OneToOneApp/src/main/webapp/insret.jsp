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
<form action="EmployeeController" method="post" name="insert">
<table>
	<tr>
		<td>First name</td>
		<td><input type="text"name="fname"></td>
	</tr>
	<tr>
		<td>Last name</td>
		<td><input type="text"name="lname"></td>
	</tr>
	<tr>
		<td>Email ID</td>
		<td><input type="text"name="email"></td>
	</tr>
	<tr>
		<td>Mobile No</td>
		<td><input type="text"name="mobile"></td>
	</tr>
	<tr>
		<td>Department Name</td>
		<td><input type="text"name="dname"></td>
	</tr>
	<tr>
		<td>salary </td>
		<td><input type="text"name="salary"></td>
	</tr>
	<tr>
		<td colspan="2"align="center">
			<input type="submit" name="action" value="insert Employee">
		</td>
	</tr>
</table>
</form>
<a href="show.jsp" style="text-decoration: none; display:block; text-align: center; margin-top: 50px ;border: 2px solid black ;padding: 10px;" > Show All Employee  </a>

</body>
</html>