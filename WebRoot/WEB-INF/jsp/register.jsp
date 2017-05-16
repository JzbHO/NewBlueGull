<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
    <form action="servlet/RegisterServlet"  method="post">
用户名:<br>
<input type="text" name="name"> 
<br>
密码:<br>
<input type="password" name="password">
<br><br>
职业:<br>
<select name="job">
  <option value ="Web前端开发工程师">Web前端开发工程师</option>
  <option value ="Java开发工程师">Java开发工程师</option>
</select> 
<br>
<input type="submit" value="注册"> 
</form>
  </body>
</html>
