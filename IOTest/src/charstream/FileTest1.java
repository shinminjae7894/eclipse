package charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException{
		//TODO 파일로부터 입력받아 콘솔로 출력
		
		BufferedReader br = new BufferedReader( 
				new FileReader("C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\Text.txt"));
		
		while(true) {
			String input = br.readLine();//입력장치를 파일로 변경
			
			if(input == null) {
				break;
			}
			
			System.out.println(input);
		}
		
		br.close();//항상 빼먹지않게 주의
	}
}
