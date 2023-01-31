<%@page import="java.lang.ProcessBuilder.Redirect"%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.swing.*"%>
<%@page import="java.lang.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<!-- <head>
<meta charset="ISO-8859-1">
<title>View</title>
<style >
*{ margin 0; padding 0;

}

.d-flex flex-column align-items-center text-center{
float Right;
}

.form{

float: middle;
margin:0px,0px,50px,10px;
padding:0%,0%,50%,50%;
background-color: #aaaaaa;



}

.card-body{
float: left;
}

</style>
</head>
<body> -->
<!-- <div class="card-body">
                  <div class="d-flex flex-column align-items-center text-center">
                    <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" class="rounded-circle" width="150">
                    <div class="mt-3">
                      <h4>Admin</h4>
                     <p class="text-secondary mb-1">Full Stack Developer</p>
                      <p class="text-muted font-size-sm">Address 283206</p>
                         <button class="btn btn-primary">Follow</button>
                      <button class="btn btn-outline-primary">Message</button>
                    </div>
                  </div>
                </div> -->
    

<!--     
<div class="form" align="middle">
<form action="user2" method="get" align="middle">  
  
Name:<input type="text" name="uname"/><br/><br/>  
Password:<input type="password" name="upass"/><br/><br/>  
Email Id:<input type="text" name="uemail"/><br/><br/>  
Phone:<input type="text" name="uphone"/><br/><br/>  
Exam Id:<input type="text" name="uexam"/><br/><br/>  
  
<input type="submit" value="Insert"/>  
  
</form>  
</div>
</body> -->







<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<style type="text/css">
	.container{
	background-color: #aaaaaa;
	width:400px;
	height: 450px;
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


center{
	/* padding: 50px;
	font-size: 20px;
	position: relative;
	top: -50px; */
	font-style: oblique;
}
	
	</style>
	</head>
<body class="con" >
<div class="container">
<form action="user2" method="get" class="one">
<center>
<h1>Insert Profile</h1>
<!-- <label>U_id</label>
<input type="text" name="uid" value=${U_id}>
<br><br> -->
<label>Name</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="uname" value=${name}>
<br><br>
<label>Pass</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="upass" value=${pass}>
<br><br>

<label>Email</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="uemail" value=${email}>
<br><br>

<label>Phone No</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="uphone" value=${phone}>
<br><br>

<label>ExamId</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="uexam" value=${exam}>
<br><br>

<input type="submit" value="Insert" class="btn">
</center>
</form>
</div>
</body>

</html>
