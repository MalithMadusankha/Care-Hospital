<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CareHospital Home Page</title>
		<link rel="styleSheet" type="text/css" href="style/homeStyle.css" /> 
		<link rel="styleSheet" type="text/css" href="style/homeStyleMy.css" /> 
		<link rel="stylesheet" type="text/css" href="style/userStyle.css" />
		<link rel="styleSheet" type="text/css" href="style/ContactUsStyle.css" />
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
		<style>
			hr.newF{
				float:bottom;
				margin-top: 100px;
				border:1px solid black;
			}
		</style>
</head>
<body>

<div class="bimg">
	<!-- Add Logo -->
		<img class="floatLogo" src="images/logo1.png" alt="CareHospital logo" width="125" height="125">
		<h1 class="floatWebName">CareHospital</h1> 
	<!-- Add Social Media -->
		<img class="floatL iconM" src="images/fbIcon.png" alt="Face book" width="30" height="30">
		<img class="floatL" src="images/Instagram.png" alt="Instagram" width="30" height="30" />
		<img class="floatL" src="images/GoogleEPlus.png" alt="GoogleEPlus" width="30" height="30">
		<img class="floatL" src="images/twitter.png" alt="Twitter" width="30" height="30">
	<!-- Login area -->
		<div class="userIcon1">
			<a href = "login.jsp">
			<img src="images/a1.png" alt="SingIn" width="75" height="75" /></a>
			<a href = "login.jsp">
			<h5 class="floatR"> SingIn </h5></a>
		</div>
		<div class="userIcon2">
			<a href = "file:///C:/Users/HP/Desktop/Project%20Assiment%202/src/Home/html/SignUp.html">
			<img src="images/a1.png" alt="singnUp" width="75" height="75" /></a>
			<a href = "file:///C:/Users/HP/Desktop/Project%20Assiment%202/src/Home/html/SignUp.html">
			<h5 class="floatR"> SingUp </h5></a>
		</div>

	<!-- Creat Menu Bar-->
	<div class="menuH" >
	
		<a class="menu" href = "index.jsp"> Home </a> 
		<a class="menu" href = "#"> Treatment </a>
		<a class="menu" href = "#"> Testing </a>
		<a class="menu" href = "News.html"> Medical </a>
		<a class="menu" href = "#"> E-Chaneling </a>
		<a class="menu" href = "#"> Contact Us </a>
		<a class="menu" href = "#">About US </a>
		<!-- Making Search Bar-->
		<div class="search-container">
			<form>
				<input type="text1" placeholder="Search.." name="search">
				<button type="submite" > <i class="fa fa-search" style="font-size:15px;color:red"></i> </button>
			</form>
		</div>
	</div>
	
</body>
</html>