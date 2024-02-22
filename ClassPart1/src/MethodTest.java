class UI{
	void line(int cnt,char type) {//void:반환형이 없다
		for(int i=0; i<cnt; i++)
			System.out.print(type);
		
		System.out.println();
	}
}

public class MethodTest {
	int sum(int num1,int num2) {
		int num3 = num1+ num2;
		return num3;//return을 쓰면 void말고 맞는 타입으로 변환
	}	
		public static void main(String[] args) {
		// TODO 메서드 작성 방법과 사용법
		UI ui = new UI();
		
		ui.line(30,'*');
		System.out.println("채팅 프로그램");
		ui.line(50,'-');
		System.out.println("1.방 만들기");
		System.out.println("2.나가기");
		ui.line(20,'=');
		
		//반환값이 있는 경우//
		
		int num1=10,num2=5;
		
		System.out.println("두 수의 합계");
		MethodTest mt = new MethodTest();
		//mt.sum(num1,num2);
		int num3 = mt.sum(num1, num2);//주소를 Stack에 저장,복귀할때 꺼내 씀
		System.out.println("결과 :" + num3);
	}

}
