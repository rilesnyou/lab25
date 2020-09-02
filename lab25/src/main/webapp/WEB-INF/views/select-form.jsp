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
	<div class="container">

		<div class="jumbotron">
			<h2 class="display-3 light">be'FORE Cast</h2>
		</div>

		<form class="form-inline" action="/find-data">
			<div class="form-group mx-sm-3 mb-2">
				<label class="sr-only">Latitude</label> <input
					type="number" name="count" class="form-control" placeholder="LAT">
			</div>
						<div class="form-group mx-sm-3 mb-2">
				<label class="sr-only">Long</label> <input
					type="number" name="count" class="form-control" placeholder="LONG">
			</div>
			<button type="submit" class="btn btn-primary mb-2">Find the weather</button>
		</form>

	</div>

</body>
</html>