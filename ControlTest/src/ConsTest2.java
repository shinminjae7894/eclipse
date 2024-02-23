class ClassDemo3{
	int iValue;
	double dValue;
	
	void print() {
		System.out.println(iValue +","+ dValue);
	}
	
	void setValue(int i,double d) {
		//검증코드
		iValue = i;
		dValue = d;
	}
	ClassDemo3(int i,double d){
		//검증코드
		iValue = i;
		dValue = d;
	}
}

public class ConsTest2 {
	public static void main(String[] args) {
		// TODO 생성자 활용 사례
		
		/*
		ClassDemo3 demo1 = new ClassDemo3();
		
		
		//검증코드
		demo1.iValue = 10;//변수의 직접저장하면 나중에 위험
		demo1.dValue = 3.14;
		demo1.print();
		
		
		demo1.setValue(10,3.14);//가급적이면 메서드 활용해서 값 넣어야함
		*/
		
		ClassDemo3 demo1 = new ClassDemo3(10,3.14);
	}

}
