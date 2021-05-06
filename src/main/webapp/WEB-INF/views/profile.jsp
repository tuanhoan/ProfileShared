<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is Profile</title>
</head>
<body>
<p>${userlink[0].socialNetworkId

 }</p>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Associal Network ID</th>
				<th scope="col">Account ID</th>
				<th scope="col">Link</th> 
			</tr>
		</thead>
		<tbody> 
			<c:forEach var="item" items="${userlink }">
				<tr>
					<th scope="row">1</th>
					<td>${item.socialNetworkId}</td>
					<td>${item.accountId }</td>
					<td>${item.link }</td> 
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>