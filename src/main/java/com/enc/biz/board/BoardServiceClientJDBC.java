package com.enc.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClientJDBC {
	public static void main(String[] args) {
		// 1. Spring Container 구동 
		
		AbstractApplicationContext container 
		= new GenericXmlApplicationContext("applicationContextJDBC.xml"); // 참조
	
		// 2. Spring Container로부터 BoardServiceImpl 객체 LookUp
		BoardService boardService = (BoardService) container.getBean("boardServiceJDBC");
	
		// 3. 글 게시, 조회 Test 
		BoardVO vo = new BoardVO();
//		vo.setTitle("임시 제목");
//		vo.setWriter("홍길동");
//		vo.setContent("임시 내용 ~~~");
//		boardService.insertBoard(vo);
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
	
		}
		container.close();
	}
}