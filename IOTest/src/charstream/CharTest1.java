package charstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharTest1 {
	public static void main(String[] args)throws IOException {
		StreamTest(System.in);

	}

	static void StreamTest(InputStream a)throws IOException{
		InputStreamReader isr = new InputStreamReader(a);
		BufferedReader br = new BufferedReader(isr);
		//input엔 readline기능이 없어서 buffered로 확장해서 실행
		
		/*
		int input =0;
		while((input = isr.read())!=-1) {
			System.out.print((char)input);
		}//read는 한글자씩 읽음
		*/
		
		String input = br.readLine();
		while(true) {
			if(input.equals("end"))
				break;
			
			System.out.println(input);
			
			input = br.readLine();
		}
		
		isr.close();
		br.close();
	}
}