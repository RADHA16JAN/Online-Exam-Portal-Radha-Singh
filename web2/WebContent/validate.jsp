<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.management.modelmbean.RequiredModelMBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@     request.getParameter("user_name") %>
<%-- <%
		String user_name=(String)request.getParameter("user_name");
		
		%>

		<h1>User Name is : <%=user_name %> </h1>
		
      <%
        String remoteAddr = request.getRemoteAddr();
        ReCaptchaImpl reCaptcha = new ReCaptchaImpl();
        reCaptcha.setPrivateKey("6Lc0Dg4kAAAAADtE9MQDLqInqHkWLwO7yv6_9sHX");

        String challenge = request.getParameter("recaptcha_challenge_field");
        String uresponse = request.getParameter("recaptcha_response_field");
        ReCaptchaResponse reCaptchaResponse = reCaptcha.checkAnswer(remoteAddr, challenge, uresponse);

        if (reCaptchaResponse.isValid()) {
          out.print("Answer was entered correctly!");
        } else {
          out.print("Answer is wrong");
        }
      %> --%>

</body>
</html>