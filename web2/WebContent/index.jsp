<%@page trimDirectiveWhitespaces="true"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="stylesheet.css" type="text/css" />

</head>
<body>

 <form method="post" action="loginFormAction.java" class="column" id="form1">
    <h1>BotDetect Java CAPTCHA Validation:<br> JSP Login Form CAPTCHA Code Example</h1>
    <fieldset>
      <legend>CAPTCHA included in JSP form validation</legend>
      
      <div class="input">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username" class="textbox" value="${param.username}" />
      </div>

      <div class="input">
        <label for="Password">Password:</label>
        <% if (request.getAttribute("isLoggedIn") == null) { %>
            <input type="password" name="password" id="password" class="textbox" />
        <% } else { %>
            <input type="text" name="password" id="password" class="textbox" value="${param.password}" />
        <% } %>
      </div>
      
      <label class="incorrect">${messages.loginError}</label>

      <%
        if ((request.getSession().getAttribute("isCaptchaSolved") == null) 
            && (request.getAttribute("isLoggedIn") == null)) {
      %>
          <label for="captchaCode" class="prompt">Retype the characters from the picture:</label>

          <!-- Adding BotDetect Captcha to the page -->
          <botDetect:captcha id="loginCaptcha" 
                userInputID="captchaCode"
                codeLength="4"
                imageWidth="200"
                codeStyle="ALPHA" />

          <div class="validationDiv">
            <input id="captchaCode" type="text" name="captchaCode" />
            <span class="incorrect">${messages.captchaIncorrect}</span>
          </div>
      <%
        }
      %>
      
      <% if (request.getAttribute("isLoggedIn") == null) { %>
          <input type="submit" name="submitButton" id="submitButton" value="Login" />
      <% } else { %>
          <a href="index.jsp">Back to login page.</a>
      <% } %>
    </fieldset>
  </form>

</body>
</html>