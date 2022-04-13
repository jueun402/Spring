package com.enc.biz.user;

import java.util.List;


public interface UserService {
	// CRUD 기능의 메소드 구현
	// User 등록
	void insertUser(UserVO vo);

	// User 수정
	void updateUser(UserVO vo);

	// User 삭제
	void deleteUser(UserVO vo);

	// User 상세 조회
	UserVO getUser(UserVO vo);

	// User 목록 조회
	List<UserVO> getUserList(UserVO vo);
}

