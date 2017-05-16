<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  
  <body>
    
  录入题目
<form action="servlet/itemservlet"  method="get">
    
题目分类    <select name="job">
  <option value ="多选题">多选题</option>
  <option value ="单选题">单选题</option>
  <option value ="单选题">单选题</option>
  <option value ="单选题">单选题</option>
</select> 
<br>
题目:<br>
<input type="text" name="itemname"> 

<br>
答案:<br>
<input type="password" name="password">
<br><br>
职业:<br>
<br>
<input type="submit" value="注册"> 
</form>
    
    
    
    
  </body>
</html>
