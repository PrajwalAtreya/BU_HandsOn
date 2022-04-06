<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2 style="color: red">Registration Form</h2>
	<form:form action="submitform" modelAttribute="emp1">
				<table>
				<tr>
					<td>Employee Name :</td>
					<td><form:input path="empName"/><form:errors path="empName" cssClass="error" cssStyle="color:red" ></form:errors></td>
				</tr>

				<tr>
					<td>Employee Age :</td>
					<td><form:input path="empAge"/><form:errors path="empAge" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Join Date :</td>
					<td><form:input path="empJoinDate" type="date"/><form:errors path="empJoinDate" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Employee Salary :</td>
					<td><form:input path="empSalary"/><form:errors path="empSalary" cssClass="error" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register"></td>
					<td><input type="reset" value="Clear"></td>
				</tr>
			</table>
		</form:form>
		
	</div>
</body>
</html>