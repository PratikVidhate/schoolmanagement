<%@page import="schoolmanagement.Teacher"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Teacher t=(Teacher)session.getAttribute("F");%>
<table cellpadding="20px" border="1" bgclor="skyblue" >
<th>Id</th>
<th>Name</th>
<th>Stream</th>
<th>Fees</th>
<tr>
<td><%=t.getId()%></td>
<td><%=t.getName() %></td>
<td><%=t.getSubject()%></td>
<td><%=t.getSalary()%></td>
</tr>
</table>

</body>
</html>