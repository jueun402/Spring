package polymorphism;


public class ssTV08 implements iTV{

	private iSpeaker05 speaker;
	private int price;
	
	
	ssTV08() { System.out.println("ssTV08() 호출"); }
	
	public ssTV08(iSpeaker05 speaker){
		super();
		System.out.println("ssTV08(speaker) 호출");
		this.speaker = speaker;
	}
	
	// 참조형과 값 형 동시에 생성 
	public ssTV08(iSpeaker05 speaker, int price){
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
		System.out.println(this.price+" 원 정도의 시간만 켜짐");
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
