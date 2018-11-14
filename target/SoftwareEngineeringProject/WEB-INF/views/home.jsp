<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course Listing</title>
    </head>
    <body>
    	<div align="center">
	        <h1>Course Listing</h1>
	        <table border="1">
	        	<th>Id</th>
	        	<th>Course Nbr</th>
	        	<th>Course Name</th>
	        	<th>Instructor</th>
	        	<th>Days</th>
	        	<th>Time</th>
	        	<th>Action</th>	        	
	        	
				<c:forEach var="course" items="${listCourse}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${course.abbrev}</td>
					<td>${course.name}</td>
					<td>${course.instructor}</td>
					<td>${course.days}</td>
					<td>${course.time}</td>
					<td>
						<a href="editCourse?id=${course.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;
						<a href="deleteCourse?id=${course.id}">Delete</a>
						&nbsp;&nbsp;&nbsp;
						<a href="addStudent?id=${course.id}">Add Student</a>	
						&nbsp;&nbsp;&nbsp;
						<a href="viewEnrollment?id=${course.id}">View Enrollment</a>											
					</td>
	        	</tr>
				</c:forEach>	        	
			</table>
 	  		<h4>
 	  			<a href="newCourse">Add a Course</a>
  	  		</h4>
    	</div>
    </body>
</html>
