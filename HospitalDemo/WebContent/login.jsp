<!-- Login UI -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/Header.jsp"></jsp:include>
</head>
<body>
<img class="" src="images/a1.png" alt="SingIn" width="100" height="100" style="margin: 30px">

	<!-- Start login Page --> 
		<div style="margin-left:50px;">
			<h1> SignIn </h1> <br>
		</div>
		<center>
			<form action="log" method="post">

					<label style="color:black" for="pemail" value="johnanta@gmail.com"> Email : </label><br>
					<input type="email" name="pemail"><br>
					<label style="color:black" for="password">  Password : </label><br>
					<input type="password" name="password" ><br>
					 
				<br>
				<input class="button" type="submit" name="submit" value="Login"> <br> <br> 
				<a href="#" class="google"><i class="fa fa-google fa-fw"></i> Sigin with Google</a>
			</form>
		</center>
		
	<!-- End login Page -->
	<jsp:include page="/Footer.jsp"></jsp:include>
</body>
</html>