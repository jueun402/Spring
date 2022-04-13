package polymorphism;

public class pdSpeaker05 implements iSpeaker05{
	
	public pdSpeaker05() {
		System.out.println("==> pdSpeaker() 시작");
	}
	public void VolumeUp() {
		System.out.println("pd Speaker 볼륨 올림");
	}
	public void VolumeDown() {
		System.out.println("pd Speaker 볼륨 내림");
	}
	
	
}
