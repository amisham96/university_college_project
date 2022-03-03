<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>University College System</title>
<link rel="icon" type="image/jpg" href="/resources/images/logo.jpg"
	sizes="32x32">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

</head>

<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

		<a class="navbar-brand" href="#">UCS</a>

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="/">Home</a></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> University </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="/university">Add New University</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="/universitiesList">List
							University</a> <a class="dropdown-item" href="/universitiesList">Update
							University</a> <a class="dropdown-item" href="/universitiesList">Delete
							University</a>
					</div></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> College </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Add New College</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">List College</a> <a
							class="dropdown-item" href="#">Update College</a> <a
							class="dropdown-item" href="#">Delete College</a>
					</div></li>
			</ul>

			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>

		</div>
	</nav>

	<div id="carouselExampleIndicators" class="carousel slide"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item">
				<img class="d-block w-100" src="/resources/images/hero1.jpg"
					alt="First slide" style="height: 500px">
			</div>

			<div class="carousel-item">
				<img class="d-block w-100" src="/resources/images/hero2.jpg"
					alt="Second slide" style="height: 500px">
			</div>

			<div class="carousel-item active">
				<img class="d-block w-100" src="/resources/images/hero3.jpg"
					alt="Third slide" style="height: 500px">
			</div>
		</div>

		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>

	</div>
	<br>

	<div class="card">
		<div class="card-header">
			<h5 class="card-title">Universities List</h5>
		</div>
		<div class="card-body">
			<form:form action="/updateExistingUniversity/${universityId}" method="POST"
				modelAttribute="university">

				<div class="form-group">
					<label for="inputAddress">Enter University Name</label> <form:input
						type="text" path="universityName" class="form-control" name="university_name"
						id="university_name" placeholder="Enter University Name" />
				</div>
				<div class="form-group">
					<label for="inputEmail4">Enter University State</label> <form:input
						type="text" path="universityState" class="form-control" name="univesity_state"
						id="university_state" placeholder="Karnataka"/>
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputPassword4">Enter University City</label> <form:input
							type="text" path="universityCity" class="form-control" name="university_city"
							id="university_city" placeholder="Enter University City"/>
					</div>
					<div class="form-group col-md-6">
						<label for="inputPassword4">Enter University ZIP</label> <form:input
							type="text" path="universityZip" class="form-control" name="university_zip"
							id="university_zip" placeholder="University ZIP"/>
					</div>
				</div>

				<button type="submit" class="btn btn-primary btn-block"
					name="submit" id="submit">Add University</button>
			</form:form><br>
			<a href="/"><button class="btn btn-primary btn-block">Go Back to Home Page</button></a>
		</div>
	</div>

</body>
</html>