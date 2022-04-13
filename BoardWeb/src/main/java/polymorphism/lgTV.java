package polymorphism;

public class lgTV implements iTV{

	lgTV(){System.out.println("lgTV 호출");}

	public void PowerOn() {
		System.out.println("LG TV 전원 켜짐");
	}
	public void PowerOff() {
		System.out.println("LG TV 전원 꺼짐");
	}

	public void VolumeUp() {
		System.out.println("LG 볼륨 올림");
	}
	public void VolumeDown() {
		System.out.println("LG 볼륨 내림");
	}
	
	@Override
	public String toString() {
		return "LGTV Test 완료";
	}
}
