class ThisDemo {
	int iValue;
	double dValue;
	
	ThisDemo(int iValue,double dValue){
		//this가 i앞에 자동으로 들어가있음
		this.iValue = iValue;//i의이름을 iValue로 하면 지역변수로 설정되어 초기값으로 나옴
		this.dValue = dValue;//이때는 this를 붙여줘야함
	}
	
	ThisDemo(){}//기본생성자는 원래 제공이지만 위에 값을 넣어서 만들었기때문에 기본생성자를 추가로 만듦
	
	void display() {
		//this가 숨겨져있음
		System.out.println("결과 :"+iValue+","+dValue);
	}
}

public class ThisTest {

	public static void main(String[] args) {
		// TODO this의 개념
		ThisDemo td1 = new ThisDemo(10,10.0);//주소의 값이 10앞에 자동으로 저장되어있음
		ThisDemo td2 = new ThisDemo(20,20.0);
		ThisDemo td3 = new ThisDemo(30,30.0);
		
		td1.display();
		td2.display();
		td3.display();
	}

}
