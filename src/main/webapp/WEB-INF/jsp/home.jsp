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
				<li class="nav-item active"><a class="nav-link" href="#">TV Shows
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/show/new">Add a Show</a></li>
				<li class="nav-item ml-5"><a class="nav-link" href="/logout">Logout</a></li>
			</ul>
		</div>
	</nav>

	<div class="mx-2 my-2">
		<h3>Welcome, ${email}</h3>
	</div>
	<br>
	
	
	<div class="mx-2 my-2">
		<h3>TV Shows</h3>
	</div>

	<div class="col-sm-12 my-3 ">
			<table class="table bg-dark text-light">
				<thead>
					<tr>
						<th scope="col">Show</th>
						<th scope="col">Network</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${shows}" var="s">
					<tr>
						<td><a href="/show/rate/${s.id}"> ${s.showTitle}</a></td>
						<td>${s.showNetwork}</td>							
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>





</body>
</html>