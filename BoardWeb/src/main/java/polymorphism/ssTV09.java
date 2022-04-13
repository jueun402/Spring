package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 컨테이너에 이름 등록 
@Component("tv1")
public class ssTV09 implements iTV{

// #. 클래스(Class)- Bean 등록
//	XML 방식 			: 유지보수 편함, XML 표기 부담  
//					: 변경될 가능성이 있을 때
	
//	Annotation 방식 	: Java 코드 수정 부담 
//					: 변경되지 않을 객체
	
	
	//speaker로 container에 등록해달라 요청 => DI
	//@Autowired // 생성자, 메소드, 멤버변수로 하나씩 주입할 때 씀=> 여러개의 speaker가 존재할 때 사용 불가  (변수 하나 등록)  
	//@Resource(name="pd") // 여러개의 speaker가 존재할 때, 사용할 speaker를 지정해주면 사용 가능 (호출) = autowired+qualifier

	// 이 두개를 합친 것 == Resource
//	@Autowired  
//	@Qualifier("nb") // 두 개 이상일 때 직접 호출
	@Resource(name="nb")
	private iSpeaker05 speaker;
	private int price;
	
	ssTV09() { System.out.println("ssTV09() 호출"); }
	
	public ssTV09(iSpeaker05 speaker){
		super();
		System.out.println("ssTV08(speaker) 호출");
		this.speaker = speaker;
	}
	
	// 참조형과 값 형 동시에 생성 
	public ssTV09(iSpeaker05 speaker, int price){
		super();
		System.out.println("ssTV08(speaker) 호출");
		this.speaker = speaker;
		this.price = price;
	}
	
	// setter가 있어야 parameter 작동 o 
	public void setSpeaker(iSpeaker05 speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void PowerOn() {
		System.out.println("SS TV 전원 켜짐");
//		System.out.println(this.price+" 원 정도의 시간만 켜짐");
	}

	public void PowerOff() {
		System.out.println("SS TV 전원 꺼짐");
	}

	public void VolumeUp() {
		speaker.VolumeUp();
	}

	public void VolumeDown() {
		speaker.VolumeDown();
	}
}
