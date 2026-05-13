<%@page import="com.dao.StudentDao"%>
<%@page import="java.rmi.StubNotFoundException"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show All Student </title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" >

</head>
<body>
<table class="table" border="2" width="100px">
  <thead>
    <tr class="text-center">
      <th >ID</th>
      <th >First Name</th>
      <th >Last Name</th>
      <th >Email ID</th>
      <th >Mobile NO</th>
      <th >Address</th>
      <th >Gender</th>
      <th >EDIT</th>
      <th >DELETE</th>
    </tr>
  </thead>
  <tbody>
    <%
     List<Student> list=StudentDao.getAllStudent();
    for(Student s:list){
    %>
   		<tr class="text-center">
   			<td><%=s.getId() %></td>
   			<td><%=s.getFname() %></td>
   			<td><%=s.getLname() %></td>
   			<td><%=s.getEmail() %></td>
   			<td><%=s.getMobile() %></td>
   			<td><%=s.getAddress() %></td>
   			<td><%=s.getGender() %></td>
   			<td>
   				<form action="StudentController" name="edit"method="post">
   					<input type="hidden" name="id" value="<%=s.getId()%>">
   					<input type="submit" name="action" value="EDIT" class="btn btn-primary">
   				</form>
   			</td>
   			<td>
   				<form action="StudentController" name="delete"method="post">
   					<input type="hidden" name="id" value="<%=s.getId()%>">
   					<input type="submit" name="action" value="DELETE" class="btn btn-danger">
   				</form>
   			</td>
   		</tr> 
   	<%
    }
    %>
    
  </tbody>
</table>
<div style="color :white; align-content: center; border: 2px solid black; background-color: white; padding: 10px ;margin-left: 80px; margin-right: 90px">
<a href="index.jsp" style="color: black; text-decoration: none; display:block; text-align: center;" > Add New Student  </a>

</div>


</body>
</html>