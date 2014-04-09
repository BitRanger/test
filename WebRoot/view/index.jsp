<%@page import="com.bitranger.example.model.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Spring MVC Demo</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  
  <body>
    <p>Spring MVC Demo. </p>
    <p>How I get to this page? </p>
    <p>${msg}</p>
    
    <br/>
<center><h2>Here is the book list from MySQL</h2></center>
<table align="center" border="1">
<tr align="left">
<th>ID</th>
<th>Name</th>
<th>Detail</th>
</tr>
<%
List<Book> books = (List<Book>)request.getAttribute("book-list");
if (books != null) {
for(Book bk : books) {
%>

<tr>
	<td><%=bk.getId()%></td>
	<td><%=bk.getName() %></td>
	<td><%=bk.getDetail() %></td>
</tr>
<%} } else {out.write("null ");}%>
</table>

  </body>
</html>
