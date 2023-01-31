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
.img {
	position: relative;
	left: 100px;
	width: 20em;
	height: 50em;
}

.form {
	background-color: lightgrey;
	width: 300px;
	border: 15px solid green;
	padding: 50px;
	margin: 20px;
	color: blue;
	font-size: 20px;
	float: left;
	z-index: 0;
}

.con {
    margin: 50px;
	position: relative;
	left: 300px;
	/* top:30px; */
	overflow: hidden;
	background-image: url("sc.jpg");
}
</style>
</head>
<body class="con">
	<%!Connection con;
	PreparedStatement st;
	ResultSet rs;%>
	<%
		try {

			String a=request.getParameter("num1");
			System.out.println(a);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		// String sql="select * from questions where name=?";
		String sql = "select question,option1,option2,option3,option4 from  questions where name=?";
		st = con.prepareStatement(sql);
		st.setString(1, a);
		rs = st.executeQuery();

		while (rs.next()) {
	%><c:forEach item="${requestScope.Question}" var="question">
		<div class="form">
			<label><%=rs.getString(1)%></label>
			<br>
			<input type="radio" value="Option1:<%=rs.getString(2)%>" name="set">
			<label><%=rs.getString(2)%></label>
			<br>
			<input type="radio" value="Option2:<%=rs.getString(3)%>" name="set">			
			<label><%=rs.getString(3)%></label>
		<br>
			<input type="radio" value="Option3:<%=rs.getString(4) %>" name="set">		
			<label><%=rs.getString(4)%></label>
			<br>
			<input type="radio" value="Option4:<%=rs.getString(5) %>" name="set">
			<label><%=rs.getString(5)%></label>
			<br>
			<input type="button" value="Submit">
		</div>
	</c:forEach>

	<%
		}

	con.close();
	} catch (Exception e2) {
		System.out.println(e2.toString());
	}
	%>
</body>


</html>