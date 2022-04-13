<%@page import="java.util.List"%>
<%@page import="com.enc.biz.board.BoardVO"%>
<%@page import="com.enc.biz.board.BoardService"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.support.AbstractApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	out.println("board");
	String[] items = request.getParameterValues("checkId");
	for (String item: items){
		out.println(item);
	}



%>

<%
		//1. Spring Container 구동 

		AbstractApplicationContext container 
		= new GenericXmlApplicationContext("applicationContextJDBC.xml"); // 참조
	
		// 2. Spring Container로부터 BoardServiceImpl 객체 LookUp
		BoardService boardService = (BoardService) container.getBean("boardServiceJDBC");
	
		// 3. 글 조회 
		BoardVO vo = new BoardVO();

		List<BoardVO> boardList = boardService.getBoardList(vo);
		
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>보기</title>
</head>
<body>

<%
if(session.getAttribute("sessionID")==null){
	response.sendRedirect("login.jsp");
}else{
%>
<%=session.getAttribute("sessionID")%>님 안녕하세요!<br>
저희 홈페이지에 방문해 주셔서 감사합니다.<br>
<form method="post" action="logout_proc.jsp">
<input type=submit value="로그아웃">
</form>
<%
}
%>
 <h2>게시판 글</h2>
 
      <div class="table-responsive">
        <table class="table table-striped table-sm">
          <thead>
            <tr>
              <th scope="col">#</th>
			  <th scope="col">seq</th>
              <th scope="col">title</th>
              <th scope="col">writer</th>
              <th scope="col">content</th>
              <th scope="col">regdate</th>              
              <th scope="col">cnt</th>
            </tr>
          </thead>
          <tbody>
     		<% for(BoardVO board : boardList) { %>              
                <tr>
                <td><input type = "checkbox" name = "checkId" value = "random"/></td>
              		<td><%=board.getSeq()%></td> 
	                <td><%=board.getTitle()%></td>
	                <td><%=board.getWriter()%></td>
	                <td><%=board.getContent()%></td>
	                <td><%=board.getRegDate()%></td>
               		<td><%=board.getCnt()%></td> 
               <tr>
			   <%}%>		 	
			
			<% container.close();%>
          
          </tbody>
     </div>
      
    <div>
        <a class="dropdown-item" href="getBoard.jsp"> 수정</a>
        <a class="dropdown-item" href="insertBoard.jsp"> 삭제</a>
        <a class="dropdown-item" href="insertBoard.jsp"> 글 목록</a>		
	</div>
</body>
</html>