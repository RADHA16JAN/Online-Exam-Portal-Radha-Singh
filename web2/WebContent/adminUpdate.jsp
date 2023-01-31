<%@page import="java.lang.ProcessBuilder.Redirect"%>
 <%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.swing.*"%>
<%@page import="java.lang.*"%>
  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
	.container{
	background-color: #aaaaaa;
	width:400px;
	height: 500px;
}
.one{
	padding: 50px;
	font-size: 20px;
	position: relative;
	top: -50px;
}
.con{
	margin: 50px;
	position: relative;
	left: 400px;
	/* background-color:red; */
	
  background-image: url("90.jpg") ;
	overflow: hidden;
}
.btn{
	font-size:30px;
}	
	</style>

</head>
<body class="con">

<div class="container">
<form action="adminUpdate" method="get" class="one">
<center>
<h1>Update Profile</h1>
<label>A_id</label>
<input type="text" name="aid" value=${A_id}>
<br><br>
<label>Name</label>
<input type="text" name="aname" value=${name}>
<br><br>
<label>pass</label>
<input type="text" name="apass" value=${pass}>
<br><br>

<label>Confirmpass</label>
<input type="text" name="aconfirmpass" value=${pass}>
<br><br>

<label>email</label>
<input type="text" name="aemail" value=${email}><br><br>
<label>Phone no</label>

<input type="text" name="aphone" value=${phone}>
<br><br>
<label>ExamId</label>
<input type="text" name="aexam" value=${exam}>
<br><br>

<br><br>
<input type="submit" value="update" class="btn">
</center>
</form>
</div>

</body>
</html>