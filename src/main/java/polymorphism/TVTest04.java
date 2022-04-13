package polymorphism;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVTest04 {

	public static void main(String[] args) {
		// 1. Spring 컨테이너 구동 
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring 컨테이너로부터 객체 요청(LookUp)
		iTV tv = (iTV)factory.getBean("lTv");
		
		tv.PowerOn();	tv.PowerOff();
		tv.VolumeUp();	tv.VolumeDown();

		tv = (iTV)factory.getBean("sTv");
		tv.PowerOn();	tv.PowerOff();
		tv.VolumeUp();	tv.VolumeDown();

		// 3. Spring 컨테이너 종료 
	}
	
}
