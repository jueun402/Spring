package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVTest09 {

	public static void main(String[] args) {
		// 1. Spring 컨테이너를 구동한다. factory가 container 
		AbstractApplicationContext factory  
			= new GenericXmlApplicationContext("applicationContext09.xml");

		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.  
		iTV tv1 = (iTV) factory.getBean("tv1");
		tv1.PowerOn();
		tv1.PowerOff();
		tv1.VolumeUp();
		tv1.VolumeDown();

//		iTV tv2 = (iTV) factory.getBean("tv2");
//		tv2.PowerOn();
//		tv2.VolumeUp();
//		tv2.VolumeDown();
//		tv2.PowerOff();

		// 3. Spring 컨테이너를 종료한다.
		factory.close();
	}

}
