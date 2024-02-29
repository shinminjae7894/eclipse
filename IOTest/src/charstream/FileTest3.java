package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTest3 {
	public static void main(String[] args) throws IOException{
		// TODO 성적표를 파일로 저장
		
		//PrintWriter pw = new PrintWriter(new BufferedWriter(
			//new FileWriter("C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\sungjuk.txt")));
		
		PrintWriter pw = new PrintWriter("C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\sungjuk.txt");
		//printwriter는 file,buffered도 포함
		
		pw.println("**********성적표**********");
		pw.println("---------------------------------");
		pw.printf("%3s : %5d %5d %5.1f %n","홍길동",98,67,(float)(98+67)/2);
		//%:위치지정, 숫자:자릿수, s:string, d:정수형, f:실수형,자릿수는 소수점기준 정수형 5과 실수형1자리, n:줄바꿈
		pw.printf("%3s : %5d %5d %5.1f %n","홍길동",88,77,(float)(88+77)/2);
		pw.printf("%3s : %5d %5d %5.1f %n","홍길동",55,65,(float)(55+65)/2);
		
		
		pw.close();
	}
}
