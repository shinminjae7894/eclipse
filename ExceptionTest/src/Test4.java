import java.io.IOException;

public class Test4 {
	static void second() throws IOException, ArithmeticException{
		System.out.println("second");
		
		System.out.print("입력 : ");
		int data = System.in.read()-48;
		
		//int result = 10/0;
		int result = 10/data;
		
	}
	
	static void first()throws IOException, ArithmeticException{
		System.out.println("first");
		second();
	}//예외처리를 넘겨줄 수 있음
	
	public static void main(String[] args) {
		try {
			first();
		}
		catch(Exception err) {
			System.out.println("main에서 모두 처리함 : "+ err);
			err.printStackTrace();
		}
	}
}
