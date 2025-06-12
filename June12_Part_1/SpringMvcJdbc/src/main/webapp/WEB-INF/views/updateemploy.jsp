<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="updateemploy">
		<center>
			Employ No : 
			<input type="number" name="empno" readonly="readonly"
						value="${result.empno}" /> <br/><br/>
			Employ Name :
			<input type="text" name="name" value="${result.name}" />
			<br/><br/>
			Gender : 
			<input type="text" name="gender" value="${result.gender}" /> <br/><br/>
			Department : 
			<input type="text" name="dept" value="${result.dept}" /> <br/><br/>
			Designation : 
			<input type="text" name="desig" value="${result.desig}" /> <br/><br/>
			Basic : 
			<input type="text" name="basic" value="${result.basic}" /> <br/><br/>
			<input type="submit" value="Update" />
		</center>
	</form>
</body>
</html>