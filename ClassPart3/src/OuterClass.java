/*
public class OuterClass {
	private int outer;
	
	//static : 아우터 클래스와 상관없이 따로 만들이지기 때문
	static class InnerClass{
		private int inner;
		
		void innerMethod() {
			System.out.println("inner :" + inner);
			
			OuterClass oc = new OuterClass();
			oc.outer = 200;
			System.out.println("outer :" + oc.outer);
			//private임에도 접근가능 
			}
	}

	public static void main(String[] args) {
		// TODO 내부 클래스가 static일 경우
		InnerClass ic = new InnerClass();
		ic.inner = 100;
		ic.innerMethod();
	}

}
*/

public class OuterClass {
	private int outer;
	
	class InnerClass{
		private int inner;
		
		void innerMethod() {
			System.out.println("inner :" + inner);
			
			outer = 200;
			System.out.println(outer);
			//같은 메모리기 때문에 가능
			}
	}

	public static void main(String[] args) {
		// TODO 내부 클래스가 General(일반 클래스)일 경우
		
		//static이 아니므로 outer와 묶여있기 때문에
		//OuterClass oc = new OuterClass();
		//InnerClass ic = oc.new InnerClass();
		
		InnerClass ic = new OuterClass().new InnerClass();
		ic.inner = 100;
		ic.innerMethod();
	}

}
