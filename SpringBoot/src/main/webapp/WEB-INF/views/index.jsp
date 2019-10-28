<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>관리자 메인 홈페이지입니다.</h1>
	<a href="/memberlist"></a>
<sec:authorize access="isAuthenticated()">
	<form action='/logout' method="post">
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">
		<input type="submit" value="LOGOUT">
	</form>
</sec:authorize>
</body>
</html>