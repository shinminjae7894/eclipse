class A{
	A(){}
	A(String s){
		System.out.println("A생성자 호출됨");
	}
}

class B extends A{
	B(){}
	B(int i){
		System.out.println("B생성자 호출됨");
	}
}

class C extends B{
	C(){
		System.out.println("C생성자 호출됨");
	}
}

public class ConsCallOrder {

	public static void main(String[] args) {
		// TODO 생성자 호출 순서

		new C();
	}

}
