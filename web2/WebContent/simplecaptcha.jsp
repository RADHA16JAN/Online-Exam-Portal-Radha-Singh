<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ page import="nl.captcha.Captcha"%> --%>
<%@ page import="com.captcha.botdetect.web.servlet.Captcha" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple CAPTCHA Example</title>
<link href="styles1.css" type="text/css" rel="stylesheet" />
</head>
<body>
<center>
<h3>Simple CAPTCHA Example</h3>
<%-- <img id="captcha" src="<c:url value="simpleCaptcha.jpg" />" width="150"> --%>


<form action="TryCaptcha.jsp" method="get">
<input type="text" name="answer"><br>
<%
Captcha captcha=Captcha.load(request,"ExampleCaptcha");
captcha.setUserInputID("captchacode");

String captchaHtml= captcha.getHtml();
out.write(captchaHtml);

%>
<input type="submit" value="Submit"></form>

<%-- <%
if(captchaHtml.equals("answer")){
	out.write("correct");
}
else{
	out.write("Incorrect");
}
%> --%>
</center>
</body>
</html>
