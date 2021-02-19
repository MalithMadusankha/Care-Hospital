<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/Header.jsp"></jsp:include>
</head>
<body>

	
<!-- Home page Conntent -->
	<br><br>
	<!-- Creat Slideshow --> 
	<div class="HmSlideContain">
		<div class="HmSlide fade">
			<div class="NoText"> 1 / 4 </div>
			<img class="imgSld" src="images/im1.jpg" style="width:100%">
			<div class="SText"> Chaneling </div>
		</div>
	
		<div class="HmSlide fade">
			<div class="NoText"> 2 / 4 </div>
			<img class="imgSld" src="images/im2.jpg" style="width:100%">
			<div class="SText"> Lab reports </div>
		</div>
	
		<div class="HmSlide fade">
			<div class="NoText"> 3 / 4 </div>
			<img class="imgSld" src="images/im4.png" style="width:100%">
			<div class="SText"> Medical </div>
		</div >
	
		<div class="HmSlide fade">
			<div class="NoText"> 4 / 4 </div>
			<img class="imgSld" src="images/im3.jpg" style="width:100%">
			<div class="SText"> Pharmacy </div>
		</div>
	</div>
	<div style="text-align:center">
		<span class="dot"><span>
		<span class="dot"><span>
		<span class="dot"><span>
		<span class="dot"><span>
	</div>
	
	
	
		<center>
	<h2> E Chaneling </h2><br>
	<div class="conHm">
		<img src="images/im5.jpg" alt ="E Chaneling" style="height:400px; width: 800px">
		<div class ="bottom-leftH"> The entry of Nawaloka Hospitals into the state dominated healthcare sector in 1985
		, saw the private health care system take root in Sri Lanka. The launch of the hospital and the overwhelming 
		response it received from the people demonstrated a long felt need for superior healthcare in a pleasant environment.
		</div>
	</div>
	<h2 class="forleft"> Medical </h2>
	<div class="conHm">
		<img class="forleft" src="images/im6.jpg" alt ="Medical" style="height:450px; width: 800px">
		<div class ="bottom-leftH"> The entry of Nawaloka Hospitals into the state dominated healthcare sector in 1985
		, saw the private health care system take root in Sri Lanka. The launch of the hospital and the overwhelming 
		response it received from the people demonstrated a long felt need for superior healthcare in a pleasant environment.
		</div>
	</div>
		
	<h2 class="forleft"> Treatment </h2>
	<div class="conHm">
		<img class="forleft" src="images/im10.jpg" alt ="Hiering Vechical" style="height:400px; width: 800px">
		<div class ="bottom-leftH"> The entry of Nawaloka Hospitals into the state dominated healthcare sector in 1985
		, saw the private health care system take root in Sri Lanka. The launch of the hospital and the overwhelming 
		response it received from the people demonstrated a long felt need for superior healthcare in a pleasant environment.
		</div>
	</div>
	
	<h2 class="forleft"> Lab Technologies </h2>
	<div class="conHm">
		<img class="forleft" src="images/im11.jpg" alt ="Hotel Booking" style="height:400px; width: 800px">
		<div class ="bottom-leftH">	When booking your vacation in Sri Lanka with Hotels By using CareHospital.com you may also earn free nights by joining the 
			Hotels.com Rewards program - It's free to join and only takes 2 minutes to sign up and when you stay 
			10 nights you receive 1 night free*. So a 10 night stay in Sri Lanka can get you a free night for your 
			next trip away.
		</div>
	</div>
	</center>
 				
<!-- End of home page content -->
		<jsp:include page="/Footer.jsp"></jsp:include>
		</div>
	<script type="text/javascript" src="js/HSlideShow.js"></script>
	
</body>
</html>