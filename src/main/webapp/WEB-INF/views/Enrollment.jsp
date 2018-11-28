<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enrollment Listing</title>
    </head>
    <body>
    	<div align="center">
	        <h1><i>Enrollment</i></h1>
	        <h3><c:out value='${course.abbrev}' /> - <c:out value='${course.name}' /></h3>
	        <table border="1">
	        	<th>Student Id</th>
	        	<th>Student Name</th>
	           	<th>Action</th>	 
				<c:forEach var="enrollment" items="${listEnrollment}" varStatus="status">
	        	<tr>
					<td>${enrollment.studentId}</td>
					<td>${enrollment.studentName}</td>
					<td>
						&nbsp;&nbsp;&nbsp;
						<a href="removeStudent?courseId=${course.id}&studentId=${enrollment.studentId}">Remove</a>
						&nbsp;&nbsp;&nbsp;
					</td>
	        	</tr>
				</c:forEach>	        	
			</table>
 	  		<h4>
 	  		    <a href="backTolistCourse">Cancel</a>
 	  		    &nbsp;&nbsp;&nbsp;
 	  			<a href="newEnroll?id=${course.id}">Enroll Student</a>
  	  		</h4>
    	</div>
    </body>
</html>
