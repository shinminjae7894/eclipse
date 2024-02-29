public class Test1 {
	public static void main(String[] args) {
		/*
		int[] arr = new int[3];
		
		System.out.println("첫번때 에외처리 테스트");
		
		arr[7] = 10;
		
		System.out.println("이 메시지가 보이는가?");
		*/	
		try {
			int[] arr = new int[3];
		
			System.out.println("첫번때 에외처리 테스트");
		
		
			//arr[7] = 10;
			arr[0] = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 벗어났습니다 :" + e);
		}
		
		catch(ArithmeticException e) {
			System.out.println("산술연산을 잘 못했습니다. :"+ e);
		}
		catch(RuntimeException e) {
			System.out.println("런타임 오류 발생");
		}
		catch(Exception e) {
			System.out.println("예외 발생");//밑으로 내려갈수록 부모
		}
		
		System.out.println("이 메시지가 보이는가?");//프로그램이 중지가 되지않고 끝까지 실행
	}
}
