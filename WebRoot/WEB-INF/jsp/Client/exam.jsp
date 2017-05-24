<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%
			int time=60*Integer.parseInt(request.getParameter("time"));
	
	 %>
	<script type="text/javascript">
		 var i;
	 var time;	
	 function starttime(){
		 time=document.getElementById("counttime").getAttribute("value");
		 time=time-1;
		 document.getElementById("counttime").setAttribute("value",time);
		 i=setTimeout("starttime()",1000);
	 }
	 function stoptime(){ 
     	clearTimeout(i);
	 }
	
	
	
	
	
	</script>
	
	

  </head>
  
  <body>
    考试时间 <input type="text" id="counttime" readonly="readonly" value="<%=time%>"><br>
    开始<input type="button" value="开始" onclick="starttime()"><br>
    暂停<input type="button" value="暂停" onclick="stoptime()">  
  </body>
</html>
