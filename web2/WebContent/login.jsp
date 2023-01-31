<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="javax.management.modelmbean.RequiredModelMBean"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!--  <script src="https://www.google.com/recaptcha/api.js"></script> -->
</head>
<body>

 <form action="validate.jsp" method="post">

			Name : <input type="text" name="user_name"><br>

        
  <button class="g-recaptcha data-sitekey="reCAPTCHA_site_key" data-callback='onSubmit' data-action='submit'>
 Submit  
 </button> 
       
       <!--  <input type="submit" value="submit"> -->
        </form>

</body>
</html>