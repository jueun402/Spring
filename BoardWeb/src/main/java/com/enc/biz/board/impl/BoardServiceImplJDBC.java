package com.enc.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enc.biz.board.BoardService;
import com.enc.biz.board.BoardVO;
import com.enc.biz.common.Log4jAdvice;
import com.enc.biz.common.LogAdvice;


@Service("boardServiceJDBC")
public class BoardServiceImplJDBC implements BoardService {
	@Autowired
	private BoardDAOSpring boardDAO; // 등록 
	
	public void insertBoard(BoardVO vo) {
//		log.printLog();
		boardDAO.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
//		log.printLog();
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
//		log.printLog();
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
//		log.printLog();
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
//		log.printLog();
		return boardDAO.getBoardList(vo);
	}

	@Override
	public void content(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}
}
