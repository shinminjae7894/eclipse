package bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException{
		//TODO 파일로부터 입력받아 콘솔로 출력
		
		FileInputStream fin = 
				new FileInputStream("C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\Text.txt");
		
		while(true) {
			int input = fin.read();//입력장치를 파일로 변경
			
			if(input == -1) {
				break;
			}//-1은 파일의 끝값
			
			System.out.println((char)input);
		}
		
		fin.close();//항상 빼먹지않게 주의
	}
}
