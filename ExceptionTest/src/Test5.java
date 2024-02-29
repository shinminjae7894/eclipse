public class Test5 {
	public static void main(String[] args) {
		try {
			System.out.println("여기는 try블럭 내부임...");
			//throw new RuntimeException("이것은 테스트용이다.");
			int i =10/0;
		}
		catch(RuntimeException e) {
			System.out.println("잘 처리됨..." + e.getMessage());
			return; //여기서 끝내라는 의미
			//System.exit(0);//여기서 종료하기 때문에 finally가 실행되지 않음
		}
		finally {
			System.out.println("finally 영역은 반드시 실행됨.");
		}//위에서 끝내라는 return이 있는데도 finally는 실행 후 돌아감
		
		System.out.println("try/catch가 끝나고 난 후...");

	}
	

}
