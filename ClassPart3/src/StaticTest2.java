public class StaticTest2 {
	StaticTest2(){
		System.out.println("생성자가 호출됨");
	}
	
	static double d1,d2;
	static {
		System.out.println("static이 생성됨");//static이 먼저 호출됨
		d1 = Math.sqrt(4.0);//sqrt는 인스턴스가 없어도 사용할 수 있는 static메서드
		d2 = Math.sqrt(8.0);
	}
	
	public static void main(String[] args) {
		// TODO static block과 생성자의 생성 순서 비교
		// String[] args 명령행 인자를 쓰기위해서
		// main : 시스템이 호출 (콜백함수),우리가 호출해서 쓰는게 아님
		// public : main을 외부에서 접근하기위해서 접근허용, static: 인스턴스가 없어도 실행할 수 있게 해줌
		new StaticTest2();
		System.out.println(d1+","+d2);
		
	}

}
