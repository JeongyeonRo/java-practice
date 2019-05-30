<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>
	<c:if test="${user == null}">
	<a href="login">로그인</a>
	</c:if>
	<c:if test="${user != null}">
	${user.nickname}님 환영합니다.<br />
	</c:if>

<a href="more">더보기</a>

</body>
</html>