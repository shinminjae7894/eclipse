import java.io.IOException;

public class inputTest {
	public static void main(String[] args) throws IOException {
		// TODO 키보드로부터 입력 받기
		System.out.print("입력 :");
		char input = (char)System.in.read();//입력한것을 아스키코드값으로 가져옴
		System.out.println("입력받은 값은" + input +"입니다");		
		System.in.skip(2);
		
		System.out.print("입력 :");
		input = (char)System.in.read();//입력한것을 아스키코드값으로 가져옴
		System.out.println("입력받은 값은" + input +"입니다");
		//enter키를 치면 저장하던 것을 멈춤,그동안 입력했던 데이터를 프로그램에 보여줌
		
		System.in.skip(2);
		
		System.out.print("숫자 입력 :");
		int num = System.in.read();//입력한것을 아스키코드값으로 가져옴
		System.out.println("입력받은 값은" + (num-48) +"입니다");
	}
}
