package polymorphism;

public class nbSpeaker05 implements iSpeaker05{

	public nbSpeaker05() {
		System.out.println("==> nbSpeaker() 시작");
	}
	public void VolumeUp() {
		System.out.println("nb Speaker 볼륨 올림");
	}
	public void VolumeDown() {
		System.out.println("nb Speaker 볼륨 내림");
	}
	
}
