<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="login_proc.jsp">
		<label for="userid"> 아이디 : </label> <input type="text" name="id"
			id="userid"><br> 
		<label for="userpwd"> 비밀번호 : </label> 
			<input type="password" name="pwd" id="userpwd"><br>
		<input type="submit" value="로그인">
	</form>
	
	
	 <% 
           // 아이디, 비밀번호가 틀릴경우 화면에 메시지 표시
           // login_proc.jsp에서 로그인 처리 결과에 따른 메시지를 보낸다.
           String msg=request.getParameter("msg");
           
            if(msg!=null && msg.equals("-1"))
           {    
               out.println("");
               out.println("<font color='red' size='1'>아이디 또는 비밀번호가 틀렸습니다.</font>");
           }
     %>    


 </body>
</html>
