package polymorphism;


public class ssTV05 implements iTV{

	private iSpeaker05 speaker;
	
	ssTV05() { System.out.println("ssTV 호출"); }
	
	public ssTV05(iSpeaker05 speaker){
		super();
		System.out.println("ssTV05 호출");
		this.speaker = speaker;
	}

	public void PowerOn() {
		System.out.println("SS TV05 전원 켜짐");
	}

	public void PowerOff() {
		System.out.println("SS TV05 전원 꺼짐");
	}

	public void VolumeUp() {
		//System.out.println("SS TV 볼륨 높임");
		// 이미 xml에서 생성돼서 들어오므로 필요 x => 생성자 없앰
		//speaker = new pdSpeaker05();
		speaker.VolumeUp();
	}

	public void VolumeDown() {
		//System.out.println("SS TV 볼륨 낮춤");
		//speaker = new pdSpeaker05();
		speaker.VolumeDown();
	}
	
	@Override
	public String toString() {
		return "ssTV05 Test 완료";
	}
}
