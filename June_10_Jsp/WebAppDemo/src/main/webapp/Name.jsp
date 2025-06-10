<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Name.jsp">
		<center>
			Student Name : 
			<input type="text" name="sname" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<%
		if (request.getParameter("sname") != null) {
			String sname = request.getParameter("sname");
			out.println("Student Name is <b>  " +sname + "</b>");
		}
	%>
</body>
</html>