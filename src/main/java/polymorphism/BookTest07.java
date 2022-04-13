package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BookTest07 {

	public static void main(String[] args) {
		
		// 1. Spring 컨테이너를 구동한다. factory가 container 
		AbstractApplicationContext factory  
			= new GenericXmlApplicationContext("applicationContext07.xml");

		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다. == dependency lookup 
		Book07 b1 = (Book07) factory.getBean("bk01");
		b1.pBook();
		
		Book07 b2 = (Book07) factory.getBean("bk02");
		b2.pBook();
		
		Book07 b3 = (Book07) factory.getBean("bk03");
		b3.pBook();
		
		// 3. Spring 컨테이너를 종료한다.
		factory.close();
		
	}

}
