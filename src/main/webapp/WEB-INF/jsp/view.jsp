<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View all user task</title>
</head>
<body>


<div class="container">

    <h1>User-TaskList</h1>
    
    <table class="table">    
   <tr>    
    <td class="heading">User Id</td>    
    <td class="heading">User Name</td>   
    <td class="heading">Task List</td> 
     <td class="heading">View</td>    
<<<<<<< HEAD
    <td class="heading">Edit</td>    
=======
>>>>>>> initial commit
    <td class="heading">Delete</td>    
   </tr>    
   <c:forEach var="user" items="${users}">    
    <tr>    
     <td>${user.id}</td>    
     <td>${user.username}</td>    
     <td>${user.tasksList}</td>
     <td><a class="btn btn-info"     href="/user-task/viewById/${user.id}">View</a></td>    
<<<<<<< HEAD
     <td><a class="btn btn-default"  href="/user-task/editById/${user.id}">Edit</a></td>    
     <td><a class="btn btn-danger"   href="/user-task/deleteById/${user.id}">Delete</a></td>    
    </tr>    
   </c:forEach>    
   <tr><td colspan="7"><a href="/user-task/add">Add New User Task</a></td></tr>    
=======
     <td><a class="btn btn-danger"   href="/user-task/deleteById/${user.id}">Delete</a></td>    
    </tr>    
   </c:forEach>    
     
>>>>>>> initial commit
  </table> 
  
 </div>  
 
 

  
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="  crossorigin="anonymous"></script>
    
</body>
</html>