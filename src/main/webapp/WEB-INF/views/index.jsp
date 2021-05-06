<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${account.size()}
	<p>${account[0].phone }</p>
	<a href="/views/trangmoi">trang moi</a>
	<a href="trangmoi">trang moi</a>
</body>
</html>