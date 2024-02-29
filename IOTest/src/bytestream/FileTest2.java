package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) throws IOException {
		// TODO 키보드로부터 입력받아 파일로 출력
		
		//출력은 파일을 안만들어도 자동 생성
		FileOutputStream fout = 
				new FileOutputStream("C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\out.txt",true);
		while(true) {
			int input = System.in.read();
			
			if(input == -1) {
				break;
			}
			
			fout.write((char)input);
		}

		fout.close();
	}

}

//java jcopy a.txt b.txt
