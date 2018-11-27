<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enroll Student</title>
</head>
<body>
	<div align="center">
		<h1>Enroll Student</h1>
		<form:form action="saveEnroll" method="post" modelAttribute="enroll">
		<table>
		    <form:hidden path="courseId"/>
		  	<tr>
				<td>Student Id:</td>
				<td>
					<form:select path="studentId">
					   <form:option value="0" label="--- Select ---"/>
					   <form:options items="${studentList}" />
					</form:select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"></td>
			</tr>
		</table>
		</form:form>
	</div>
</body>
</html>