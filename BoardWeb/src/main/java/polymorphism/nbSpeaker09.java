package polymorphism;

import org.springframework.stereotype.Component;

//컨테이너에 이름 등록 
@Component("nb")
public class nbSpeaker09 implements iSpeaker05{

	public nbSpeaker09() {
		System.out.println("==> nbSpeaker09() 시작");
	}
	public void VolumeUp() {
		System.out.println("nb Speaker 볼륨 올림");
	}
	public void VolumeDown() {
		System.out.println("nb Speaker 볼륨 내림");
	}
	
}
