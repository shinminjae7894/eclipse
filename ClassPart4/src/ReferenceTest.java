class First {
	int a = 10;
	
	void display() {
		System.out.println("a: " + a);
	}
}

class Second extends First {
	int b = 20;
	
	void print() {
		System.out.println("b: " + b);
	}//오버라이딩 부모가 가지고있는 display를 고쳐서 쓰는것
}

public class ReferenceTest {
	public static void main(String[] args) {
		// TODO 부모와 자식클래스의 참조 관계
		
		First f1 = new First();
		f1.display();
		
		Second s1 = new Second();
		s1.print();
		
		First f2 = f1;
		f2.display();
		
		//f2 = (First)s1; //서로 다른 클래스들끼리는 절대로 참조할 수 없다
		f2 = s1;//부모는 자신이 내어준 내용만 참조가능,자식의 추가로 된 내용은 참조불가
		f2.a = 11;
		f2.display();//부모 자식으로 만들어줘서 참조가능
		
		//f2.b = 21;
		//f2.print();
		
		//Second s2 = (Second)f1;//자식은 부모 참조 불가,캐스팅해도 결과 에러
		//s2.b = 21;
		
		Second s2 = (Second)f2;
		s2.a =12;
		s2.display();
		s2.b = 21;
		s2.print();
	}

}
