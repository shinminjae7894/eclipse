package charstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest2 {

	public static void main(String[] args) {
		// TODO 키보드로부터 입력받아 파일로 출력
		
		FileWriter fout = null;
		BufferedReader br = null;
		
		//출력은 파일을 안만들어도 자동 생성
		try { 
		fout =
			new FileWriter("C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\out.txt",true);
		//외부장치를 쓰는경우 반드시 예외처리를 해줘야 함
		
		br =
			new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = br.readLine();
			
			if(input == null) {
				break;
			}
			
			fout.write(input);
			fout.flush();
			}
		}
		catch(IOException err) {
			System.out.println(err);
			err.printStackTrace();
		}
		finally {
			try {fout.close();} catch(IOException err) {}
			try {br.close();} catch(IOException err) {}
		}
	}
}


//java jcopy a.txt(명령행 인자로 다운받아서) b.txt
