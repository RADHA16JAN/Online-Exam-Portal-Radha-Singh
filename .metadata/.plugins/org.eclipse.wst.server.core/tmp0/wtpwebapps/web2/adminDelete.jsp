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
	height: 200px;
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
<form action="adminDelete" method="get" class="one">
<center>
<h1>Delete Data</h1>
<label>A_ID</label>
<input type="text" name="name">
<br><br>
<input type="submit" value="delete" class="btn">
</center>
</form>
</div>

</body>
</html>