<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="loginresult">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Password : 
			<input type="password" name="passCode" /> <br/><br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	<p style="color:red">
		${error}
	 </p>
</body>
</html>