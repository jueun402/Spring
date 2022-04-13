package polymorphism;

import org.springframework.stereotype.Component;

//컨테이너에 이름 등록 
//@Component("pd") // container에 주입 
public class pdSpeaker09 implements iSpeaker05{
	
	public pdSpeaker09() {
		System.out.println("==> pdSpeaker09() 시작");
	}
	public void VolumeUp() {
		System.out.println("pd Speaker 볼륨 올림");
	}
	public void VolumeDown() {
		System.out.println("pd Speaker 볼륨 내림");
	}
	
	
}
