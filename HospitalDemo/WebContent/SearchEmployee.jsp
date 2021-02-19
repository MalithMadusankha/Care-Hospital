<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/HeaderLog.jsp"></jsp:include>
</head>
<body>
<!-- Search employee page -->
<div style="margin:10px 1400px 10px 10px"><a href="userAccount.jsp"> Back </a></div>

<h2> Modify Employee </h2>

<c:forEach var="emp" items="${empDetails}">

	<form method="post" action="modifyUserServelet">
		Employee ID : <input type="text" name="id" value="${emp.cID}" readonly/> <br><br>
		Employee Name : <input type="text" name="name" value="${emp.name}" /> <br><br>
		Employee Position : <input type="text" name="position" value="${emp.position}" /><br> <br>
		Employee Phone : <input type="text" name="phone" value="${emp.phone}" /> <br><br>
		Employee Nic : <input type="text" name="nic" value="${emp.nic}" /> <br><br>
		Employee Email : <input type="email" name="pemail" value="${emp.email}" /> <br><br>
		Employee Password : <input type="text" name="password" value="${emp.password}" /> <br><br>
	<br><br>
	
	<input class="button" type="submit" value="Save"/> <p>   
	</form>
	<h2> Delete Employee </h2>
	<form method="post" action="deletUserServelet">
		Employee ID : <input type="text" name="id" value="${emp.cID}" readonly/> <br><br>
		 </p> <input class="button" type="submit" value="Delet Employee"/>
	</form>
			
</c:forEach>


	
<!-- Search employee page -->

<jsp:include page="/Footer.jsp"></jsp:include>

</body>
</html>