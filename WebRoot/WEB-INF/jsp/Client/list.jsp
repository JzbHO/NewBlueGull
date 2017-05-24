<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="domain.Person"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

 <% Person p=(Person)session.getAttribute("person");
		String career=p.getCareer();
	%> 

<title>登录成功</title>
     <base href="<%=basePath%>">


	 
    
     		
		  <script type="text/javascript" 	 >
   				 function rec(){
   				
    var mymessage=confirm("参加考试,考试内容可在个人中心修改");
    if(mymessage==true)
    {
    	return true;
    }
    else
    {
       return false;
    }
  }  
  </script>  
	


</head>


	
 
  <body>
  <form action="servlet/CenterServlet"  method="post">
  		<input type="submit" value="个人中心">
  </form>
  

  <form  action="servlet/listServlet"  onsubmit="return rec()" method="post">
  请选择考试时间:
 <label><input name="time" type="radio" value="60" />1个小时 </label> 
<label><input name="time" type="radio" value="90" />1个半小时</label> 
<label><input name="time" type="radio" value="120" />2个小时</label> 

 <br>      

  <input type="submit" value="开始考试" >
   
 </form> 
	
  </body>
  

</html>
