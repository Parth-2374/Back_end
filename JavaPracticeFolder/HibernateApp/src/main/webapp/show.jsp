<%@page import="com.dao.StudentDao"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="table" border="2" width="100%" cellpadding="10px" cellspacing="10px" >
  <thead >
    <tr class="text-center">
      <th >ID</th>
      <th >First Name</th>
      <th >Last Name</th>
      <th >Email ID</th>
      <th >Mobile NO</th>
      <th >EDIT</th>
      <th >DELETE</th>
    </tr>
  </thead>
  <tbody>
    <%
     List<Student> list=StudentDao.getAllStudent();
    for(Student s:list){
    %>
   		<tr style="text-align: center;">
   			<td ><%=s.getId() %></td>
   			<td><%=s.getFname() %></td>
   			<td><%=s.getLnmae() %></td>
   			<td><%=s.getEmail() %></td>
   			<td><%=s.getMobile() %></td>
   			<td>
   				<form action="StudentController" name="edit"method="post">
   					<input type="hidden" name="id" value="<%=s.getId()%>">
   					<input type="submit" name="action" value="EDIT" style="border: none;">
   				</form>
   			</td>
   			<td>
   				<form action="StudentController" name="delete"method="post">
   					<input type="hidden" name="id" value="<%=s.getId()%>">
   					<input type="submit" name="action" value="DELETE" style="border: none;" >
   				</form>
   			</td>
   		</tr> 
   	<%
    }
    %>
    
  </tbody>
</table>
<a href="insret.jsp" style="text-decoration: none; display:block; text-align: center; margin-top: 50px ;border: 2px solid black ;padding: 10px;" > Add New Student  </a>

</body>
</html>