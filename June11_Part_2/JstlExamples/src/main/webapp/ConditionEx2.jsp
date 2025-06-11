<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="ConditionEx2.jsp">
		<center>
			Enter a Number : 
			<input type="number" name="sno" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.sno != null}">
		<c:if test="${param.sno % 2 == 0}">
			<c:out value="Even Number..." />
		</c:if>
		<c:if test="${param.sno % 2 != 0}">
			<c:out value="Odd Number..." />
		</c:if>		
	</c:if>
</body>
</html>