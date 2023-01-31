<%@ page import="nl.captcha.Captcha"%>
<%@ page import="javax.servlet.http.HttpSession" %>



<%
	HttpSession session2=request.getSession();
	Captcha captcha = (Captcha) session2.getAttribute(Captcha.NAME);
	System.out.println(String.valueOf(captcha));
	/* System.out.println(captcha.getHtml()); */
	request.setCharacterEncoding("UTF-8");
	String answer = request.getParameter("answer");
	System.out.print(answer); %>
	<%if (captcha.isCorrect(answer)) {
		System.out.print(answer);	
%>
<center>
<b>Correct Captcha Code !</b> 
<% } else { %> 
<b>In Correct Captcha Code !</b> 
<% } %>
</center>

