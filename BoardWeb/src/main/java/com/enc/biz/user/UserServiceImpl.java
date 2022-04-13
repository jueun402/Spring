package com.enc.biz.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enc.biz.user.impl.UserDAO;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO UserDAO;

	public void insertUser(UserVO vo) {
		UserDAO.insertUser(vo);
	}

	public void updateUser(UserVO vo) {
		UserDAO.updateUser(vo);
	}

	public void deleteUser(UserVO vo) {
		UserDAO.deleteUser(vo);
	}

	public UserVO getUser(UserVO vo) {
		return UserDAO.getUser(vo);
	}

	public List<UserVO> getUserList(UserVO vo) {
		return UserDAO.getUserList(vo);
	}
}


