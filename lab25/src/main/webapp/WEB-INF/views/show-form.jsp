<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link href="/style.css" rel="stylesheet" />
</head>
<body>

	<h1>Forecast for <c:out value="${ response.data.weather }" />,
	    <c:out value="${ response.currentobservation.image }" /></h1>

	<ul>
	<!-- only loop through lists or arrays. -->
	<c:forEach var="textItem" items="${ response.data.text }" varStatus="loop">
		<li>
			<img src="<c:url value="${ response.data.iconLink[loop.index] }"/>"/>
			<c:out value="${ textItem }" />
		</li>
	</c:forEach>
	</ul>


</body>
</html>