<%@page import="schoolmanagement.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Student</title>
</head>
<body align="center
+

">
<%Student s=(Student)session.getAttribute("Hello1");%>
<table cellpadding="20px" border="1" bgclor="skyblue" >
<th>Id</th>
<th>Name</th>
<th>Stream</th>
<th>Fees</th>
<tr>
<td><%=s.getId()%></td>
<td><%=s.getName() %></td>
<td><%=s.getStream() %></td>
<td><%=s.getFees() %></td>
</tr>
</table>
</body>
</html>