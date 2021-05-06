<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="profile">Profile</a>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Id</th>
				<th scope="col">UserName</th>
				<th scope="col">DisplayName</th>
				<th scope="col">Gmail</th>
				<th scope="col">Phone</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${account }">
				<tr>
					<th scope="row">1</th>
					<td>${item.id}</td>
					<td>${item.username }</td>
					<td>${item.displayName }</td>
					<td>${item.gmail }</td>
					<td>${item.phone }</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>