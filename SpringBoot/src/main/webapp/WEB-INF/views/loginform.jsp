<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/login" method="post">
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">
		ID:<input type="text" name="id"><br>
		PASSWORD:<input type="password" name="pw"><br>
		<input type="submit" value="로그인">
	</form>

</body>
</html>