<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item "><a class="nav-link" href="/show/home">TV
						Shows <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="#">Add a Show</a></li>
				<li class="nav-item ml-5"><a class="nav-link" href="/logout">Logout</a></li>
			</ul>
		</div>
	</nav>

	<h2>Create a new Show</h2>

	<form action="/show/form" method="POST" class="mx-3 my-3">
		<div class="form-group row col-6">
			<label for="showTitle" class="col-sm-2 col-form-label">Show Title:</label>
			<div class="col-sm-10">
				<input type="text" name="showTitle" class="form-control"
					id="showTitle">
			</div>
		</div>
		<div class="form-group row col-6">
			<label for="showNetwork" class="col-sm-2 col-form-label">Network:</label>
			<div class="col-sm-10">
				<input type="text" name="showNetwork" class="form-control" id="showNetwork">
			</div>
		</div>
		
		<div class="form-group row">
			<div class="col-sm-10 mx-3">
				<button type="submit" class="btn btn-primary">Create</button>
			</div>
		</div>

	</form>

		<div class="row">
			<div class="col-sm-10 mx-3">
				<a href="/user/home"><button type="submit" class="btn btn-primary bg-dark">Go Back</button></a>
			</div>
		</div>



</body>
</html>