package polymorphism;

public class Book07 {

	String title = "무 제";
	String author = "무 명";
	int price = 100;
	
	Book07(){
		System.out.println("==> Book06 기본 생성자");
	}
	
	Book07(String t, String a, int p){
		this.title = t;
		this.author = a;
		this.price = p;
		System.out.println("==> Book06(t,a,p) 생성자");

	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void pBook() {
		System.out.println(this.title+","+this.author+","+this.price);
	}
	
}
