package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 컨테이너에 이름 등록 
@Component("tv10")
public class ssTV10 implements iTV{

	@Autowired
	private iSpeaker05 speaker;
	private int price;
	
	ssTV10() { System.out.println("ssTV10() 호출"); }
	
	public ssTV10(iSpeaker05 speaker){
		super();
		System.out.println("ssTV10(speaker) 호출");
		this.speaker = speaker;
	}
	
	
	public ssTV10(iSpeaker05 speaker, int price){
		super();
		System.out.println("ssTV10(speaker) 호출");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void setSpeaker(iSpeaker05 speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void PowerOn() {
		System.out.println("SS TV10 전원 켜짐");
	}

	public void PowerOff() {
		System.out.println("SS TV10 전원 꺼짐");
	}

	public void VolumeUp() {
		speaker.VolumeUp();
	}

	public void VolumeDown() {
		speaker.VolumeDown();
	}
}
