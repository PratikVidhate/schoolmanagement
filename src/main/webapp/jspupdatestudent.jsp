<%@page import="schoolmanagement.Student"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>**********</title>
</head>
<body bgcolor="purple" align="center">
<div style="margin: 120px"></div>
<center>
<h3>Enter Details For Update :</h3>

<%int id = Integer.parseInt(request.getParameter("id"));
EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratik");
EntityManager em = emf.createEntityManager();

Student s = (Student)em.find(Student.class, id);

%>
</center>

<div style="margin: 120px"></div>
<h3><b>***Update Student***</b></h3>

<form action="asdf" method="post">
Id: <br>
<input type="text" value="<%=s.getId()%>" name="id"><br><br>
Name: <br>
<input type="text" value="<%=s.getName() %>" name="name"><br><br>
Stream: <br>
<input type="text" value="<%=s.getStream()%>" name="stream"><br><br>
Fees: <br>
<input type="text" value="<%=s.getFees()%>" name="fees"><br><br>
<button type="submit">Update</button>


 </form>

</body>
</html>