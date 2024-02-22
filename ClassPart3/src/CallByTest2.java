/*
public class CallByTest2 {
	void swap(int[] n) {
		int temp = n[0];
		n[0] = n[1];
		n[1] = temp;
	}

	public static void main(String[] args) {
		// TODO 반드시 참조에 의한 전달을 사용해야 하는 경우
		
		//int num1 = 5,num2 = 10;
		//원하는 위치에서 바꿔야하는 경우
		int[] nums = {5,10};
		
		CallByTest2 call = new CallByTest2();
		call.swap(nums);
		
		System.out.println("교환 후...");
		System.out.println(nums[0]+", "+nums[1]);
	}

}
*/

//인스턴스 변수를 이용하는 방법

public class CallByTest2 {
	int num1 = 5,num2 = 10;
	
	void swap() {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}

	public static void main(String[] args) {
		// TODO 반드시 참조에 의한 전달을 사용해야 하는 경우
		
		
		
		CallByTest2 call = new CallByTest2();
		call.swap();
		
		System.out.println("교환 후...");
		System.out.println(call.num1+", "+call.num2);
	}

}