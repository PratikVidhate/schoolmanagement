<%@page import="schoolmanagement.Teacher"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body bgcolor="teal" align="center">
<div style="margin: 120px"></div>
<h3>*****Enter Details For Update*****</h3>
<%int id = Integer.parseInt(request.getParameter("id"));
EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratik");
EntityManager em = emf.createEntityManager();

Teacher t = (Teacher)em.find(Teacher.class, id);
%>
<form action="artist" method="post">
ID: <br>
<input type="text" value="<%=t.getId()%>" name="id" size="20"><br><br><br>
Name: <br>
<input type="text" value="<%=t.getName()%>" name="name" size="20"><br><br><br>
Subject: <br>
<input type="text" value="<%=t.getSubject()%>" name="subject" size="20"><br><br><br>
Salary: <br>
<input type="text" value="<%=t.getSalary()%>" name="salary" size="20"><br><br><br>
<button type="submit">Update</button>
</form>
</body>
</html>