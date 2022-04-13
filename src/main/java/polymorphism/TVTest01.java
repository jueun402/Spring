package polymorphism;

public class TVTest01 {

	public static void main(String[] args) {
		
		iTV tv1 = new ssTV();
		iTV tv2 = new lgTV();
		
		iTV[] tvArrs = {tv1, tv2};
		for(iTV tv: tvArrs) {
			tv.PowerOn();
			tv.PowerOff();
			tv.VolumeUp();
			tv.VolumeUp();
		}
		
		iTV[] TVs = { new ssTV(), new lgTV() };
		
		for(iTV tv : TVs) { tv.PowerOn(); tv.PowerOff(); tv.VolumeUp(); tv.VolumeDown(); }
	}

}
