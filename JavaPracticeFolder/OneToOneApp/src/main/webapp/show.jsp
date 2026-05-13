<%@page import="com.bean.Employee"%>
<%@page import="com.dao.StudentDao"%>

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
      <th >Employee ID</th>
      <th >First Name</th>
      <th >Last Name</th>
      <th >Email ID</th>
      <th >Mobile NO</th>
      <th >EID</th>
      <th >dname </th>
      <th >Salary</th>
      <th >EDIT</th>
      <th >DELETE</th>
    </tr>
  </thead>
  <tbody>
    <%
     List<Employee> list=StudentDao.getAllEmployee();
    for(Employee s:list){
    %>
   		<tr style="text-align: center;">
   			<td ><%=s.getEinfo().getEinfo() %></td>
   			<td><%=s.getEinfo().getFname() %></td>
   			<td><%=s.getEinfo().getLname() %></td>
   			<td><%=s.getEinfo().getEmail() %></td>
   			<td><%=s.getEinfo().getMobile() %></td>
   			<td><%=s.getDid() %></td>
   			<td><%=s.getDnmae() %></td>
   			<td><%=s.getSalary() %></td>
   			<td>
   				<form action="EmployeeController" name="edit"method="post">
   					<input type="hidden" name="did" value="<%=s.getDid()%>">
   					<input type="submit" name="action" value="EDIT" style="border: none;">
   				</form>
   			</td>
   			<td>
   				<form action="EmployeeController" name="delete"method="post">
   					<input type="hidden" name="did" value="<%=s.getDid()%>">
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