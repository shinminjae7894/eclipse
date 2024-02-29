import java.io.IOException;

/*
public class Test3 {
	public static void main(String[] args) {
		System.out.print("입력 :");
		
		char input = ' ';
		try {
			input = (char)System.in.read();//예외처리를 반드시 해야함
		}
		catch(IDException e) {
			
		}
		System.out.println("입력받은 값은" + input +"입니다");
	}
}
*/

public class Test3 {
	public static void main(String[] args)throws IOException, RuntimeException {
		System.out.print("입력 :");
		
		char input = ' ';
		input = (char)System.in.read();//예외처리를 반드시 해야함
		
		System.out.println("입력받은 값은" + input +"입니다");
	}
}