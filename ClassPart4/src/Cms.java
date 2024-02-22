//main 메서드를 가지고있으면 안됨,main은 하나만 있어야함
public class Cms {
	private int no; //private를 썼으면 쓸 수 있게 해줘야
	private String name;
	private char level;
	
	public Cms(){}//필요있든 없든 기본생성자를 만들어주는게 좋음
	public Cms(int no,String name,char level) {
		this.no = no;
		this.name = name;
		this.level = level;
	}
	
	void display() {
		System.out.println("고객번호: "+no);
		System.out.println("고객이름: "+name);
		System.out.println("고객등급: "+level);
	}
}
