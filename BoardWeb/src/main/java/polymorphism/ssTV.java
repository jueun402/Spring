package polymorphism;


public class ssTV implements iTV{
	
	private pdSpeaker05 speaker;
	
	ssTV(){System.out.println("ssTV 호출");}

	public void PowerOn() {
		System.out.println("SS TV 전원 켜짐");
	}
	public void PowerOff() {
		System.out.println("SS TV 전원 꺼짐");
	}
	@Override
	public void VolumeUp() {
		speaker.VolumeUp();
		//	System.out.println("SS 볼륨 올림");
	
	}
	public void VolumeDown() {
		speaker.VolumeDown();
		//	System.out.println("SS 볼륨 내림");
	}
	
	@Override
	public String toString() {
		return "ssTV Test 완료";
	}
}
