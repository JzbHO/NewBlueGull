<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script type="text/javascript">
    var mystr="我是";
    var mychar="JavaScript";
    document.write("mystr+mychar");
    
    function rec(){                                         
    window.open('http://www.imooc.com','width=300,height=200,menubar=no,toolbar=no, status=no,scrollbars=yes')
    }
  </script>
  <body>
    <form action="servlet/login"  method="post">
用户名:<br>
<input type="text" name="name"> 
<br>
密码:<br>
<input type="password" name="password">
<br><br>
职业:<br>
<input type="text" name="career"> 
<br>
<input type="submit" value="登录"> <input type="button" value="注册" onClick="rec()">
</form>
  </body>
</html>
