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
<script type="text/javascript">
	function hello() {
		
	}
</script>

	<style type="text/css">
	
	.container{
	background-image: linear-gradient(#00ab41,#00ab41);
	 border: 5px solid #555;
	width:400px;
	height: 350px;
	
}

.one{
	padding: 50px;
	font-size: 20px;
	position: relative;
	top: -50px;
	font-style: Arial;
}

center{
	padding: 50px;
	font-size: 20px;
	position: relative;
	top: -50px; 
	font-style: oblique;
}

.con{
	margin: 50px;
	position: relative;
	left: 300px;
	/* top:30px; */
	overflow: hidden;
    background-image: url("27.jpg");
  
    /* width: 100%;
	height: 100%; */
	}
}
</style>

</head>
<body class="con">



<div  class="container"> 


 <form action="scores" method="get">
 <center>
 
 
<%-- <label>Userid </label>
<input type="text" name="u_id">
<br>

<input type="text" name="two" value="${Question}" readonly="readonly">
<br>

<label>Option1 </label>
<input type="radio" name="one" value="${Option1}">
<label>${Option1}</label>
<br>

<label>Option2</label>
<input type="radio" name="one" value="${Option2}">
<label>${Option2}</label>
<br>

<label>Option3 </label>
<input type="radio" name="one" value="${Option3}">
<label>${Option3}</label>
<br>

<label>Option4 </label>
<input type="radio" name="one" value="${Option4}">
<label>${Option4}</label>
<br>

<input type="submit" value="Submit"> --%>



<label>User Id </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="sub">
<br><br>

<label>Question </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="two" value="${Question}" readonly="readonly">
<br><br>

<label>Option1 </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="one" value="${Option1}">
<label>${Option1}</label>
<br><br>

<label>Option2 </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="one" value="${Option2}">
<label>${Option2}</label>
<br><br>

<label>Option3 </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="one" value="${Option3}">
<label>${Option3}</label>
<br><br>

<label>Option4 </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="one" value="${Option4}">
<label>${Option4}</label>
<br><br>




<input type="submit" value="Submit" style="
	font-size:30px;
	font-style:italic;
">


</center>
</form> 
</div>

</body>
</html>