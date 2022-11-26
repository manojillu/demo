 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
 <!DOCTYPE html>
<html lang="en">
<head>
  <title>Welcome</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	 <form:form action="#" id="myForm" method="post">
			</br>
			<h2 align="center">List of Users </h2>
			</br>
			<div class="container">
			   	<table class="table table-bordered">
			    <thead>
			      <tr>
			        <th>Firstname</th>
			        <th>Lastname</th>
			        <th>Email</th>
			        <th>Phone Number</th>
			      </tr>
			    </thead>
			    <tbody>
			     <c:forEach items="${detailsList}" var="details">
			      <tr>
			     
				        <td>${details.fName}</td>
				        <td>${details.lName}</td>
				        <td>${details.email}</td>
				        <td>${details.pno}</td>
			       
			      </tr>
			       </c:forEach>
			    </tbody>
			  </table>
	 </form:form>
		  
		</div>

</body>
</html>
