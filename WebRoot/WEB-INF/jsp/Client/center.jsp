<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="domain.Person" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'center.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <p1>个人中心</p1><br>
  <body>
  		<%Person p=(Person)session.getAttribute("person"); %>	
  
  	用户名:<% 
  			
  			out.print(p.getName());
  	
  		%>
  	职业:<% 
  		
  			out.print(p.getCareer());
  		%>	
    <br>
  </body>
</html>
