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
	background-image: linear-gradient(#E8BEAC,#E8BEAC);
	width:400px;
	height: 300px;
	
}
.one{
	padding: 50px;
	font-size: 25px;
	position: relative;
	top: -50px;
	font-style: italic;
}
.con{
	margin: 50px;
	position: relative;
	left: 400px;
	background-color:red;
	overflow: hidden;
	}
	@keyframes example {
  0%   {background-color:red;}
  25%  {background-color:yellow;}
  50%  {background-color:blue;}
  75%  {background-color:green;}
  100% {background-color:red; }
}
body {
  width: 100px;
  height: 100px;
  background-color: red;
  animation-name: example;
  animation-duration: 4s;
  animation-iteration-count:infinite;
  background-image: url("8.jpg");
}	
	</style>

</head>
<body class="con">
<div class="container">
 <form class="one" action="edit" method="get">
 <center>
           
            <label >D_id</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="text" name="d_id" value="${id}"><br><br>
           
            
            <label>Enter Details</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="text" name="tname" value="${name}"><br><br>
          
            <br>
           <!--  <input type="submit" name="btn1" value="edit"> -->
           <input type="submit" value="Edit" name="btn1" style="
	font-size:30px;
	font-style: italic; ">
           </center>
            </form> 
            
</div>	
</body>
</html>