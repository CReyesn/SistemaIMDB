<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item "><a class="nav-link" href="">TV
						Shows <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="#">Login</a></li>
				<li class="nav-item "><a class="nav-link" href="/registrar/">Registration</a></li>
			</ul>
		</div>
	</nav>


	<div class="container">
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<form action="/login" method="post" class="form-signin">
					<h3 class="form-signin-heading my-3">Login</h3>
					
					<br/> 
					<input type="text" id="email" name="email"
						placeholder="Email" class="form-control" /> <br /> 
						
						<input type="password" placeholder="Password" id="password"
						name="password" class="form-control" /> <br />

					<div align="center">
						<c:if test="${param.error}">
							<p style="font-size: 20; color: #FF1C19;">Verifica las
								credenciales.</p>
						</c:if>
					</div>

					<button class="btn btn-lg btn-primary btn-block" name="Submit"
						value="Login" type="Submit">Login</button>
				</form>
			</div>

		</div>
	</div>
</body>
</html>