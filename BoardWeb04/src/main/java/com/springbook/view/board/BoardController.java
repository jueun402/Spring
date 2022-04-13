package com.springbook.view.board;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller // main controller 
@SessionAttributes("board") // board의 내용을 session으로 올림 session 화 되어있어서 전체 정보를 갖고있음 
public class BoardController {
	@Autowired
	private BoardService boardService;
	
//	컨트롤러들을 method화 
// BoardVO vo 안에 자동으로 생성됨
// 해당 url이 호출된 페이지에 있는 정보만 담음 
	// 글 등록
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo) { // (BoardVO vo) : title, .... 등 다 가져와서 생성됨 바로 
		boardService.insertBoard(vo);
		return "getBoardList.do";
	}

	
//	String s =  type에 대한 데이터의 주소를 s에 담는다 
//	board(글 내용)에 대한 내용을 가져와서 modelAttribute로 변형된 내용을 BoardVO vo에 넣어라 
//	(String) (s)와 동일한 구조임 
//	(ModelAttribute "board") (BoardVO vo)
//	
//	하나의 객체에 멤버필드를 넣는 구성 
//	이미 만들어진 것 가지고 탑재 
	// 글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {			
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}

	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}

	
//	model 
//	board를 탑재시킬 때 addattribute가 탑재해야할 내용
//	
	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo)); // Model 정보 저장
		return "getBoard.jsp"; // View 이름 리턴
	}
	
//	conditionMap() key와 value의 형태로 접근하자 
// 	conditionMap이라는걸 만들어서 탑재가 되어서 presentation xml에 읽혀져서 등록 
//	hashmap이라는 collection generic 타입 가지고 선언 -> 제목과 내용
//	conditionmap return -> getboardlist에 있음 
	// 검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}

	// 글 목록 검색
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		// Null Check
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		// Model 정보 저장
		model.addAttribute("boardList", boardService.getBoardList(vo));																
		return "getBoardList.jsp"; // View 이름 리턴
	}
}
