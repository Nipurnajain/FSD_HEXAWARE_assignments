
<%@page import="java.util.*, java.lang.*, com.hexaware.springboot_webapp.entity.Employee" %>

<h1>display here</h1>


<% 
List<Employee> list=(List<Employee>)session.getAttribute("emplist");

out.println(list);





%>