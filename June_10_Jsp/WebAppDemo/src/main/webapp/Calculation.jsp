<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Calculation.jsp">
		<center>
			First Number : 
			<input type="number" name="firstNo" /> <br/><br/>
			Second Number :
			<input type="number" name="secondNo" /> <br/><br/>
			<input type="submit" value="Calculation" />
		</center>
	</form>
	<%
		if (request.getParameter("firstNo") !=null 
				&& request.getParameter("secondNo") != null
				) {
			int firstNo = Integer.parseInt(request.getParameter("firstNo"));
			int secondNo = Integer.parseInt(request.getParameter("secondNo"));
			int result = firstNo + secondNo;
			out.println("Sum is  " +result + "<br/>");
			result = firstNo - secondNo;
			out.println("Sub is  " +result + "<Br/>");
			result = firstNo * secondNo;
			out.println("Mult is  " +result + "<br/>");
		}
			
	%>
</body>
</html>