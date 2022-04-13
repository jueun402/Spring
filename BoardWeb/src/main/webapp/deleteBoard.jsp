<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<%
		String[] items = request.getParameterValues("checkId");
	%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<font color="blue"> 당신의 선택은 -> </font>
	<% if(items != null){ %>
	<ul><% for(String item : items){ %>
			<li> <%=item%> </li> 
		<%} %>
	</ul>
	<% } else { %>
		<font color="red"> 선택한 내용 없음 </font>
	<% } %>
</body>
</html>