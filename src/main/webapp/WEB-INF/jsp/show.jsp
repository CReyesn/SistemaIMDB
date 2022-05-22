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
				<li class="nav-item active"><a class="nav-link" href="#">TV
						Shows <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="/show/new">Add
						a Show</a></li>
				<li class="nav-item ml-5"><a class="nav-link" href="/logout">Logout</a></li>
			</ul>
		</div>
	</nav>

	<div class="mx-2 my-2">
		<h3>Title: ${show.showTitle}</h3>
	</div>
	<div class="mx-2 my-2">
		<h4>NetWork: ${show.showNetwork}</h4>
	</div>
	<div class="mx-2 my-2 ">
		<h4>
			<strong>Users who rated this show</strong>
		</h4>
	</div>
	<br>


	<div class="col-sm-12 my-3 ">
		<table class="table bg-dark text-light">
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Rating</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${show.ratings}" var="s">
					<tr>
						<td> ${s.user.email}</td>
						<td>${s.rating}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div class="row mx-3 my-3">
		<div class="col-sm-10 mx-3">
			<a href="/show/edit/${show.id}"><button type="submit"
					class="btn btn-primary bg-success">Edit</button></a>
		</div>
	</div>

	<form action="/show/rateForm" method="POST">
		<input type="hidden" value="${show.id}" name="showId"
			class="form-control" id="showId">
		<div class="d-flex justify-content-start">
			<div class="row">
				<div class="col-auto mx-3">
					<p>Leave a rating</p>
				</div>
				<div class="col-auto">
					<select class="custom-select" name="rating" id="rating"
						aria-label="Example select with button addon">
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option selected>5</option>
					</select>
				</div>
				<div class="col">
					<button type="submit" class="btn btn-primary bg-primary">Rate!</button>
				</div>
			</div>
		</div>
	</form>




	<div class="row">
		<div class="col-sm-10 mx-3">
			<a href="/show/home"><button type="submit"
					class="btn btn-primary bg-dark">Go Back</button></a>
		</div>
	</div>

</body>
</html>