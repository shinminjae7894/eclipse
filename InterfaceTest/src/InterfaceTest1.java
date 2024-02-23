interface Inter1{
	int a = 10;//static final public
	
	void inter1Method();//오버라이딩 반드시 해야함
}

interface Inter2 extends Inter1{
	int b = 20;
}//같은 인터페이스들끼리 상속할때도 extends

interface Inter3 extends Inter1, Inter2{
	int c = 30;
}

public class InterfaceTest1 implements Inter3{
	//상속받았기때문에 Inter3만 써줘도 됨
	public static void main(String[] args) {
		// TODO 인터페이스 기본 문법
		
		//System.out.println(Inter1.a);//static의 특징
		//Inter1.a = 100; //수정안됨
		
		System.out.println(a + ", " + b +", " + c);
	}

	
	public void inter1Method() {
		System.out.println("오버라이딩");
		
	}

}
