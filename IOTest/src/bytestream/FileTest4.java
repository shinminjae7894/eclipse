package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileTest4 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee[] emp = new Employee[3];
	emp[0] = new Employee(1,"홍길동","영업",100,1000000);
	emp[1] = new Employee(2,"임꺽정","기술",111,1200000);
	emp[2] = new Employee(3,"신돌석","개발",112,1500000);
	
	ObjectOutputStream oos = new ObjectOutputStream(
		new FileOutputStream(
			"C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\emp.dat"));
	oos.writeObject(emp[0]);
	oos.writeObject(emp[1]);
	oos.writeObject(emp[2]);
	
	oos.close();
	
	System.out.println("********사원 정보**********");
	System.out.println("사번\t이름\t업무\t부서번호\t급여");
	System.out.println("-------------------------------------");
	
	ObjectInputStream ois = new ObjectInputStream(
			new FileInputStream(
				"C:\\Users\\acorn\\OneDrive\\바탕 화면\\BackEnd\\JavaWork\\FileTest\\emp.dat"));
	for(int i=0;i<3;i++) {
		Employee e = (Employee)ois.readObject();
		System.out.println(e);
	}

	ois.close();
	}
}










