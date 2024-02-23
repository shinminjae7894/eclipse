class ClassDemo2{
	int iValue;//생성자는 알아서 초기화해줌
	
	ClassDemo2(int i){
		System.out.println(i);
	}
	
	ClassDemo2(){
		
	}
}


public class ConsTest1 {

	public static void main(String[] args) {
		// TODO 생성자 기본 개요
		ClassDemo2 ob1 = new ClassDemo2();
		ClassDemo2 ob2 = new ClassDemo2(10);
		
		int i =0;
		System.out.println(i);
		
		System.out.println(ob1.iValue);
		
	}

}

