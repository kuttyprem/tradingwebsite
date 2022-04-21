<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/Index.css">
  <link rel="stylesheet" href="css/Login.css">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <script src="js/general.js"></script>
  
   <!--GOOGLE FONTS-->

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Lato&display=swap" rel="stylesheet">
    
    <link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Gideon+Roman&display=swap" rel="stylesheet">
	
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
	
	<!-- Font Awesome -->
	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  
</head>

<body>

<nav class='navbar navbar-expand-lg navbar-light bg-light'>
<a class='navbar-brand' href='Home' style='text-decoration: none; margin: 0 auto;'><img src='img/vt_logo.png' width='75px; height : 35px;'></a>
<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarTogglerDemo03' aria-controls='navbarTogglerDemo03' aria-expanded='false' aria-label='Toggle navigation'>
<span class='navbar-toggler-icon'></span>
</button>
<div class='collapse navbar-collapse' id='navbarTogglerDemo03'>
<ul class='navbar-nav mr-auto mt-2 mt-lg-0'></ul>
<form class='form-inline my-2 my-lg-0'><ul class='navbar-nav mr-auto mt-2 mt-lg-0'>
<li class='nav-item active'><a class='nav-link' href='Home'>Home<span class='sr-only'>(current)</span></a></li>
<li class='nav-item active'><a class='nav-link' href='Product'>Product</a></li>
<li class='nav-item active'><a class='nav-link' href='About_Us.html'>About Us</a></li>
<li class='nav-item active'><a class='nav-link' href='Contact_Us.html'>Contact Us</a></li>
<li class='nav-item active'><a class='nav-link' href='Login.jsp'>Login</a></li>
</ul>
</form>
</div>
</nav>

<div class="wrapper">
  <form class="login"  action="AdminLogin" method="post">  
    <p class="title">Sign in</p>
    <input type="text" name="username" id="username" placeholder="Username" required="required" autofocus/>
    <i class="fa fa-user"></i>
    <input type="password" name="keycode" id="keycode" placeholder="Password" required="required"/>
    <i class="fa fa-key"></i>
	<span style="font-size: 14px;" >Forgot Password&nbsp;?&nbsp;&nbsp;<a href="#" data-toggle="modal" data-target="#exampleModal" >Click Here</a></span>
    <button type="submit" >
      <i class="spinner"></i>
      <span class="state">Log in</span>
    </button>
  </form>
</div>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
 <div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Forgot Password</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
		</div>
			<form action="FgotPwd" method="post">
				<div class="modal-body">
					<div class="row">
						<div class="col-md-12">
							<label>Email&nbsp;:&nbsp;</label> <input class="form-control"
								type="email" name="ForgotMail" id="ForgotMail"
								placeholder="Please Enter Registered Email Id"
								required/>
								<br>
								<p>*Current Username & Password Sent To Registered E-mail.</p>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<!-- <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button> -->
					<!-- <button type="button" class="btn btn-primary">Submit</button> -->
					<input type="submit" class="btn btn-primary" value="Submit" />
				</div>
			</form>
		</div>
	</div>
</div>

</body>
</html>