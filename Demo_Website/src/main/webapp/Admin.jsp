<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/Index.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<script src="js/general.js"></script>

<!--GOOGLE FONTS-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lato&display=swap"	rel="stylesheet">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gideon+Roman&display=swap"	rel="stylesheet">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">

</head>

<body>

	<nav class='navbar navbar-expand-lg navbar-light bg-light'>
		<a class='navbar-brand' href='Home'
			style='text-decoration: none; margin: 0 auto;'><img
			src='img/vt_logo.png' width='75px; height : 35px;'></a>
		<button class='navbar-toggler' type='button' data-toggle='collapse'
			data-target='#navbarTogglerDemo03'
			aria-controls='navbarTogglerDemo03' aria-expanded='false'
			aria-label='Toggle navigation'>
			<span class='navbar-toggler-icon'></span>
		</button>
		<div class='collapse navbar-collapse' id='navbarTogglerDemo03'>
			<ul class='navbar-nav mr-auto mt-2 mt-lg-0'></ul>
			<form class='form-inline my-2 my-lg-0'>
				<ul class='navbar-nav mr-auto mt-2 mt-lg-0'>
					<!-- 	<li class='nav-item active'><a class='nav-link' href='Home'>Home<span
							class='sr-only'>(current)</span></a></li>
					<li class='nav-item active'><a class='nav-link' href='Product'>Product</a></li>
					<li class='nav-item active'><a class='nav-link'
						href='About_Us.html'>About Us</a></li>
					<li class='nav-item active'><a class='nav-link'
						href='Contact_Us.html'>Contact Us</a></li> -->
						<li class='nav-item active'><span class='nav-link' ><b>Welcome</b>&nbsp;:&nbsp;Mr.Selvaganesh</span></li>
					<li class='nav-item active'><span class='nav-link' id="date"></span>
					</li>
					<li class='nav-item active'><a class='nav-link' href='Home'>Logout</a></li>
				</ul>
			</form>
		</div>
	</nav>

	<div class="container">

		<div class="New_Line" ></div>

		<div class="row">
			<div class="col-md-4">

				<div class="card">
					<div class="card-header">
						<h3 class="heading">File Upload</h3>
					</div>
					<div class="card-body">

						<form action="FileUploadServlet" method="post"
							enctype="multipart/form-data">
							<input type="file" name="TxtFileName" id="TxtFileName"
								accept=".txt" required="required">
							<div class="New_Line"></div>
							<input class="btn btn-light border-dark" type="submit"
								value="Upload">
						</form>

						<div class="New_Line"></div>

						<p>*Here We Can Upload Scrip / Product Text Files.</p>

					</div>
				</div>

			</div>
			<div class="col-md-4">

				<div class="card">
					<div class="card-header">
						<h3 class="heading">Download</h3>
					</div>
					<div class="card-body">
						<p>*Download Latest 'Scrip Table' Text File</p>
						<div class="New_Line"></div>
						<a href="" class="btn btn-light border-dark" download>Download</a>
					</div>
				</div>

			</div>
			<div class="col-md-4">

				<div class="card">
					<div class="card-header">
						<h3 class="heading">Download</h3>
					</div>
					<div class="card-body">
						<p>*Download Latest 'Product' Text File</p>
						<div class="New_Line"></div>
						<a href="" class="btn btn-light border-dark" download>Download</a>
					</div>
				</div>

			</div>
		</div>

		<div class="New_Line"></div>

		<div class="row">
			<div class="col-md-12">
				<p>*Note : Please Upload Only The Text File With Proper Data...</p>
			</div>
		</div>
		
		<div class="New_Line" ></div>
		<div class="New_Line" ></div>

		<div class="row">
			<div class="col-md-12">
				<hr>
				<p style="text-align: center;">All Rights Reserved By VishaTech</p>
			</div>
		</div>

	</div>

	<script type="text/javascript">
	
	  var today = new Date();
	  //var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();
	  var date = today.getDate()+'-'+(today.getMonth()+1)+'-'+today.getFullYear();
	  var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
	  var dateTime = date+' '+time;
	
	document.getElementById("date").innerHTML = 'Last Login : '+dateTime;
	</script>

</body>
</html>