class StaticDemo{
	int a;
	int b;
	static int c; //인스턴스는 원래 묶음으로 여러개 저장,static으로 저장하면 다른곳에 하나만 저장(모든곳에서 공동으로 사용가능)
	}
//클래스 밖에다 선언 못함

public class StaticTest1 {
	static int d;
	
	static void method1() {
		System.out.println("method1 호출됨");
	}
	
	public static void main(String[] args) {
		// TODO static이란?

		StaticDemo.c = 100;
		System.out.println(StaticDemo.c);
		
		StaticDemo demo1 = new StaticDemo();//c는 안만들어짐
		StaticDemo demo2 = new StaticDemo();
		
		System.out.println(demo1.c);//공동으로 사용가능하기 때문에 나옴
		
		demo1.c = 200;
		
		System.out.println(StaticDemo.c);
		System.out.println(demo2.c);
		
		//StaticTest1.d = 300;
		//같은클래스일 경우 생략 가능
		d=300;
		
		System.out.println(StaticTest1.d);
		
		//StaticTest1.method1();
		method1();
		
	}

}
