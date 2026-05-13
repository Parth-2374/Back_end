<%@page import="com.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" >

<style type="text/css">
tr,td{
	padding: 10px;	
}
body{
    font-family: Arial;
}
container {
    width: 450px;
    margin: 50px auto;
    background: #fff;
    padding: 25px;
    border-radius: 10px;
    box-shadow: 0px 10px 25px rgba(0,0,0,0.2);
}
h2{
    text-align:center;
    margin-bottom:20px;
    margin-top: 10px;
}

.inpu, textarea {
    width: 100%;
    padding: 8px;
    border-radius: 5px;
    border: 1px solid #ccc;
}

.inpu:focus, textarea:focus{
    border-color:#667eea;
    box-shadow:0 0 5px #667eea;
    outline:none;
}
.mail,.female{
		padding: 10px;
		margin-left: 40px;
		margin-right: 10px;
}
</style>
</head>
<body>
	<div style="color :white; align-content: center; border: 2px solid black; background-color: blue; " >
	 	
	 <%
		Student s=(Student)request.getAttribute("s");
	%>
	</div>
<form method="post" action="StudentController" class="container">
	<table class="table table-borderless">
			<h2 >Student Form</h2>
			<tr>
			 	<td><input type="hidden" name="id" value="<%=s.getId()%>"></td> 
			</tr>
		<tr>
			<td> First Name </td>
			<td > <input name="fname" type="text" class="inpu" value="<%=s.getFname() %>" ></td>
		</tr>
		<tr>
			<td> Last Name </td>
			<td> <input name="lname" type="text" class="inpu" value="<%=s.getLname() %>"></td>
		</tr>
		<tr>
			<td> Email ID </td>
			<td> <input name="email" type="text" class="inpu" value="<%=s.getEmail() %>"></td>
		</tr>
		<tr>
			<td> Mobile No </td>
			<td> <input name="mobile" type="text" class="inpu" value="<%=s.getMobile()%>"></td>
		</tr>
		<tr>
			<td> Address </td>
			<td> <textarea rows="5" cols="22" name="address" ><%=s.getAddress() %></textarea></td>
		</tr>
		<tr>
			<td> Gender </td>
			<td> 
			<%
				if(s.getGender().equalsIgnoreCase("male")){
					%>
					<input type="radio" name="gender" value="male" class="mail" checked="checked">Male
					<input type="radio" name="gender" value="female" class="female">Female
			
					<%
					}else{
					%>
						<input type="radio" name="gender" value="male" class="mail">Male
						<input type="radio" name="gender" value="female" class="female" checked="checked">Female
			
					<%	
					}
			 	%>
				</td>
		</tr>
		<tr>
			<td colspan="2" align="center"> 
			 <input type="submit" name="action" value="update" class="inpu btn btn-primary mt-4">
			 </td>
			
		</tr>
	</table>
</form>
<div style="color :white; align-content: center; border: 2px solid black; background-color: white; padding: 10px ;margin-left: 80px; margin-right: 90px">
<a href="show.jsp" style="color: black; text-decoration: none; display:block; text-align: center;" > ShowAllStudent Data </a>

</div>

</body>
</html>