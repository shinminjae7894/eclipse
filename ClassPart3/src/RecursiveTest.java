public class RecursiveTest {
	int fact1(int num) {
		int result= 1;
		
		for (int i=1;i<=num;i++) {
			result *=i;
		}
		return result;	
	}
	int fact2(int num) {
		int result = 0;
		
		if(num == 1) {
			return 1;
		}
		result = fact2(num-1)*num;//함수로오면 자기주소를 stack에 저장하고 다시 함수 호출
		return result;
	}
	
	public static void main(String[] args) {
		// TODO 재귀함수
		
		RecursiveTest rt = new RecursiveTest();
		
		System.out.println("반복문 사용 : " + rt.fact1(4));
		System.out.println("재귀함수 사용 : " + rt.fact2(4));
	}

}
