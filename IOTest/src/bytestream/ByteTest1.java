package bytestream;

import java.io.IOException;

public class ByteTest1 {
	public static void main(String[] args) throws IOException {
		byte[] bArr = new byte[10];
		
		System.out.print("문자 입력 : ");
		System.in.read(bArr);
		System.out.println("입력한 값 : " + bArr);
		for(byte b : bArr) {
			System.out.println((char)b);//1btye가 넘어가면 깨짐
		}
		
	}
}
