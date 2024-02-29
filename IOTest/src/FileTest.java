import java.io.File;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) {
		// TODO File 클래스

		File f = new File("C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\emp.dat");
		
		if(f.exists()) {
			System.out.println("파일의 이름: "+f.getName());
			System.out.println("파일의 경로(상대): "+f.getPath());
			System.out.println("파일의 이름(절대): "+f.getAbsolutePath());
			System.out.println("크기: "+f.length()+"byte");
			System.out.println("마지막 수정일: "+ new Date(f.lastModified()));
			//초로 나옴 ,new Date로 묶고 import 설정을 util 패기지로 해야함
		}
		else {
			System.out.println("파일이 존재하지 않습니다");
			
		}
		f.delete();//파일삭제
	}

}
