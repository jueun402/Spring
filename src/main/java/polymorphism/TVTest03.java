package polymorphism;

public class TVTest03 {

	public static void main(String[] args) {

		BeanFactory factory = new BeanFactory();
	
		iTV tv = (iTV)factory.getBean(args[0]);
	
		tv.PowerOn();	tv.PowerOff();
		tv.VolumeUp();	tv.VolumeDown();
		
	}
}
