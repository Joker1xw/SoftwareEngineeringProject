<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Course</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit Course</h1>
		<form:form action="saveCourse" method="post" modelAttribute="course">
		<table>
			<form:hidden path="id"/>
			<tr>
				<td>Course Abbrev:</td>
				<td><form:input path="abbrev" /></td>
			</tr>
			<tr>
				<td>Course Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Instructor:</td>
				<td><form:input path="instructor" /></td>
			</tr>
			<tr>
				<td>Course Days:</td>
				<td><form:input path="days" /></td>
			</tr>
			<tr>
				<td>Course Time:</td>
				<td><form:input path="time" /></td>
			</tr>			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"></td>
			</tr>
		</table>
		</form:form>
	</div>
</body>
</html>