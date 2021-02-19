<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/HeaderLog.jsp"></jsp:include>
</head>
<body>
<!-- Add Employee page content -->

<div style="margin:10px 1000px 10px 10px"><a href="userAccount.jsp"> Back </a></div>

<div style="margin:10px 50px">
<form method="POST" action="AddEmployeeServlet">
		<table>
			<tr>
				<td>Employee ID</td>
				<td><input type="text" name="employeeID" /></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="employeeName" /></td>
			</tr>

			<tr>
				<td>Employee Designation</td>
				<td><input type="text" name="designation" /></td>
			</tr>
			<tr>
				<td>Phone Number</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>NIC</td>
				<td><input type="text" name="nic" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>			
			<tr>
				<td colspan="2"><input type="submit" value="Add Employee" class="button" /> </td>
			</tr>
			<tr>	
				<td colspan="2"><input type="reset" value="Reset" class="button" /></td>
			</tr>
		</table>
	</form>
</div>
<div>


<div style="margin:10px 1000px 10px 10px"><a href="userAccount.jsp"> Back </a></div>
<!-- End of Add Employee page content -->
<jsp:include page="/Footer.jsp"></jsp:include>
</body>
</html>