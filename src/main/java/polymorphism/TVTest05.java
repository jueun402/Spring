package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVTest05 {

	public static void main(String[] args) {
		// 1. Spring 컨테이너를 구동한다. factory가 container 
		AbstractApplicationContext factory  
			= new GenericXmlApplicationContext("applicationContext05.xml");

		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다. == dependency lookup 
		iTV tv = (iTV) factory.getBean("tv");
		tv.PowerOn();
		tv.VolumeUp();
		tv.VolumeDown();
		tv.PowerOff();

		// 3. Spring 컨테이너를 종료한다.
		factory.close();
	}

}
