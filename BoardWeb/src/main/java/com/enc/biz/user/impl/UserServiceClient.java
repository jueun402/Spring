package com.enc.biz.user.impl;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.enc.biz.user.UserService;
import com.enc.biz.user.UserVO;

public class UserServiceClient {

	public static void main(String[] args) {

		// 1. Spring container 

		AbstractApplicationContext container 
		= new GenericXmlApplicationContext("applicationContextUser11.xml"); // 참조
	
		// 2. Spring Container로부터 UserServiceImpl 객체 Lookup
		UserService userService = (UserService) container.getBean("userService");
		
		// 3-1. User 등록
		UserVO vo = new UserVO();
		vo.setId("jueun404");
		vo.setName("Jueun Yoo");
		vo.setPassword("1234");
		vo.setRole("user");
		userService.insertUser(vo);

		// 3-2. User 삭제 
		vo.setId("jueun404");
		userService.deleteUser(vo);

		// 3-3. User 수정 

		vo.setId("jueun402");
		vo.setPassword("user111");
		vo.setName("jueun");
		vo.setRole("user");
		userService.updateUser(vo);
		
		// 3-4. User 조회 
		vo.setId("jueun402");
		vo.setPassword("user111");
		UserVO users = userService.getUser(vo);
		if(users !=null) {
			System.out.println(users.getName()+" 님 환영합니다.");			
		}
		else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
		// 3-5. User 조회 
		List<UserVO> userList = userService.getUserList(vo);

		for(UserVO user: userList) {
			System.out.println("---> "+user.toString());
		}
		container.close();
	}

}
