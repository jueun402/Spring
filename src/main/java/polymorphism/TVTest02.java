package polymorphism;

public class TVTest02 {

	public static void main(String[] args) {

		//생성과 동시에 주입 - DI(Dependency Injection)
		aptA a1 = new aptA();
		
		// 생성 후, 별도 주입 
		aptB b1 = new aptB();
		System.out.println(b1.setTV(new ssTV()));

		b1 = new aptB();
		System.out.println(b1.setTV(new lgTV()));

	}

}
