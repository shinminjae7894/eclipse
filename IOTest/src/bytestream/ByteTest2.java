package bytestream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteTest2 {
	public static void main(String[] args) throws IOException{
		/*
		while(true) {
			int input = System.in.read();
			
			if(input == -1) {
				break;
			}//-1은 ctrl+z
			
			System.out.println((char)input);
		}
		*/
		/*
		int input = 0;
		while((input = System.in.read()) != -1){
			System.out.println((char)input);
		}
		*/
		StreamTest(System.in,System.out);
	}
	
	static void StreamTest(InputStream in, OutputStream out)throws IOException {
		int input = 0;
		while((input = in.read()) != -1){
			out.write((char)input);//print로 하면 오류 write는 조립하는 기능이 있기 때문에 한글도 출력가능
			
		}
	}
}
