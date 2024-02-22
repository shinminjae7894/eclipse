
public class OverloadTest {

	void display() {
		System.out.println("출력 내용이 없음");
	}
	
	void display(int i) {
		System.out.println(i);//같은이름으로 여러기능 활용가능,매개변수가 달라야함
	}
	
	void display(int i, double d) {
		System.out.println(i + "," + d);
	}
	
	void display( double d,int i) {
		System.out.println(d + "," + i);
	}
	public static void main(String[] args) {
		// TODO 메서드의 오버로드
		OverloadTest ot = new OverloadTest();
		ot.display();
		ot.display(10);
		ot.display(3.14,100);
		ot.display(100,2.5);
	}

}
