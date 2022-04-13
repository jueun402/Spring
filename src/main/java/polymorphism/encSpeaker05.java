package polymorphism;

public class encSpeaker05 implements iSpeaker05{
	
	public encSpeaker05() {
		System.out.println("==> encSpeaker05() 시작");
	}
	public void VolumeUp() {
		System.out.println("enc Speaker볼륨 올림");
	}
	public void VolumeDown() {
		System.out.println("enc Speaker 볼륨 내림");
	}
	
}
