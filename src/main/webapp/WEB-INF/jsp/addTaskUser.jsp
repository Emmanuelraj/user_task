<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add</title>
</head>
<body>


<div class="container">

    <h1>Add Task user</h1>
  <form:form method="POST"  action="/add-task/" modelAttribute="task">

<table>
<tr>
    <td><form:label path="username">User Name</form:label></td>
    <td><form:input path="username" /></td>
</tr>
<tr>
    <td><form:label path="taskName">TaskName</form:label></td>
    <td><form:input path="taskName" /></td>
</tr>

<tr>
    <td><form:label path="taskDesc">Task Desc</form:label></td>
    <td><form:input path="taskDesc" /></td>
</tr>
<tr>
    <td><form:label path="taskStatus">Task Status</form:label></td>
    <td><form:input path="taskStatus" /></td>
</tr>
<tr>
    <td colspan="2">
        <input type="submit" value="Submit"/>
    </td>
</tr>
</table>  
</form:form> 
 </div>  
 
 

  
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="  crossorigin="anonymous"></script>
    
</body>
</html>