class ClassDemo1{
	int iValue;
	//클래스안에 선언된 변수,인스턴스 변수(멤버 변수)
	double dValue;
}//class는 파일하나에 하나가 원칙이지만 편의위해 사용

public class ClassTest {
	//main method는 하나,시작점
	public static void main(String[] args) {
		// TODO 클래스의 인스턴스 생성
		//new ClassDemo1().iValue = 10;
		//저장했지만 꺼내올 수 없음,주소저장 필수
		//System.out.println(new ClassDemo1().iValue);
		
		ClassDemo1 cd1 = new ClassDemo1();
		//메모리의 주소 저장,참조 변수
		cd1.iValue = 10;
		System.out.println(cd1.iValue);
		
		int iValue = 100;
		//메서드안에 선언된 변수,일반변수,하나의 값 저장,기본타입의 데이터 저장
		
		//cd1 = 1000;
		//iValue = cd1; 둘다 안됨 구별해서 사용해야함
		
		
	}

}
