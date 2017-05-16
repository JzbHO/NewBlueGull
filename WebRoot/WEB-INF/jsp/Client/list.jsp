<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录成功</title>
    
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
  <form  action="servlet/RegisterServlet"  method="post">
  请选择考试时间:
    <select name="job">
  <option value ="60">1个小时</option>
  <option value ="90">1个半小时</option>
  <option value ="120">2个小时</option>
</select> 
 <br>      
<!--  <input type="button" value="开始考试" onclick="location.href='localhost:8080/NewBlueGull/WEB-INF/jsp/exam.jsp'">-->
<input type="submit" value="开始考试">
 </form> 
  
  </body>
</html>
