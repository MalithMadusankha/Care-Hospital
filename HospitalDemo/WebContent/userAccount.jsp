<!-- User UI -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/HeaderLog.jsp"></jsp:include>
</head>
<body>
	<c:forEach var="cus" items="${cusDetails}">
	<!-- Calling getfunctions -->
	<h2>${cus.position} Page</h2>
	<h4>${cus.name}</h4> <br>
	
		${cus.cID}
		
	
		${cus.phone}
		${cus.nic}
		${cus.email}
		${cus.password}
	</c:forEach>
	<br><br>
	<div style="margin:100px 1200px 10px 10px">
		<a href="AddEmployee.jsp"><button class="button"> Add Employee</button></a>
	</div>
	<br><br>
	<div style="margin:30px">
		<form method="post" action="SearchEmployeeServlet">
			<h5>By using Employee Id : </h5> <input type="text" name="id" />
			 <input type="submit" value="Search" class="button" />
		</form>
	</div>
	<br><br>
<jsp:include page="/Footer.jsp"></jsp:include>
</body>
</html>