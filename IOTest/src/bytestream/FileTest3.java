package bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest3 {
	public static void main(String[] args)throws IOException {
		// TODO 기본 데이터타입 입출력, DataInputStream, DataOutputStream
		//Filter class : 여러 바이트를 묶어서 확장,다른클래스를 도와줌(객체를 도와줌)
		//Wrapper class : 객체가아닌것을 도와줌
		
		FileOutputStream fout = 
				new FileOutputStream
				("C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\Dataout.txt",true);
		
		DataOutputStream dout= new DataOutputStream(fout);
		
		dout.writeChar('가');
		dout.writeInt(100);
		dout.writeDouble(3.14);
		dout.writeBoolean(true);
		
		
		dout.close();
		fout.close();
		
		
				
		DataInputStream din= new DataInputStream(
					new FileInputStream
					("C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\Dataout.txt"));
		
		System.out.println(din.readChar());
		System.out.println(din.readInt());
		System.out.println(din.readDouble());
		System.out.println(din.readBoolean());
		
		din.close();
	}
}
