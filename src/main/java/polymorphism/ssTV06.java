package polymorphism;


public class ssTV06 implements iTV{

	private iSpeaker05 speaker;
	
	ssTV06() { System.out.println("ssTV06 호출"); }
	
	public void setSpeaker(iSpeaker05 speaker){
		
		System.out.println("setSpeaker 호출");
		this.speaker = speaker;
	}

	public void PowerOn() {
		System.out.println("SS TV06 전원 켜짐");
	}

	public void PowerOff() {
		System.out.println("SS TV06 전원 꺼짐");
	}

	public void VolumeUp() {
		speaker.VolumeUp();
	}

	public void VolumeDown() {
		speaker.VolumeDown();
	}
	
}
