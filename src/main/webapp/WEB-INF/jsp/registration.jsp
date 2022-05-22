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
				<li class="nav-item"><a class="nav-link" href=#>TV Shows
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/login">Login</a></li>
				<li class="nav-item active"><a class="nav-link" href="/registrar/">Registration</a></li>
			</ul>
		</div>
	</nav>

<div class="mx-2 my-2">
		<h2>Registrar!</h2>
	</div>

<form action="/registrar/form" method="POST" class="mx-3 my-3">
		<div class="form-group row col-6">
			<label for="username" class="col-sm-2 col-form-label">Username:</label>
			<div class="col-sm-10">
				<input type="text" name="username" class="form-control" id="username">
			</div>
		</div>
		<div class="form-group row col-6">
			<label for="email" class="col-sm-2 col-form-label">Email:</label>
			<div class="col-sm-10">
				<input type="email" name="email" class="form-control" id="email">
			</div>
		</div>
		<div class="form-group row col-6">
			<label for="password" class="col-sm-2 col-form-label">Password:</label>
			<div class="col-sm-10">
				<input type="password" name="password" class="form-control"
					id="password">
			</div>
		</div>
		<div class="form-group row col-6">
			<label for="passwordConfirmation" class="col-sm-2 col-form-label">Password Confirmation:</label>
			<div class="col-sm-10">
				<input type="password" name="passwordConfirmation" class="form-control" id="passwordConfirmation">
			</div>
		</div>
					
      				<c:if test = "${error!=null}">
         			<p style="font-size: 20; color: #FF1C19;"> <c:out value = "${error}"/><p>
      				</c:if>
					

		<div class="form-group row">
				<div class="col-sm-10 mx-3">
					<button type="submit" class="btn btn-primary">Registrar</button>
				</div>
			</div>

	</form>




</body>
</html>