/*
public class CallByTest1 {
	void display(int a,int b, int c, int d, int e) {
		System.out.println(a+","+ b+ ","+ c +","+ d +","+ e);
	}

	public static void main(String[] args) {
		// TODO 값에 의한 전달
		int a=4, b=7, c=15, d=80, e=9;
		
		CallByTest1 call = new CallByTest1();
		call.display(a,b,c,d,e);	
	}
}
*/

/*
public class CallByTest1 {
	void display(int[] arrays) {
		for(int arr:arrays) {
			System.out.println(arr);
		}
	}

	public static void main(String[] args) {
		// TODO 참조에 의한 전달1 : 배열을 이용한 방법
		//int a=4, b=7, c=15, d=80, e=9;
		int[] arr= {4,7,15,80,9};
		//값들은 heap에 저장,arr이라는 변수는 stack에 저장(주소)
		
		CallByTest1 call = new CallByTest1();
		call.display(arr);	
	}
}
*/

/*
public class CallByTest1 {
	int a=4, b=7, c=15, d=80, e=9;//인스턴스 변수
	
	void display() {
		System.out.println(a+","+ b+ ","+ c +","+ d +","+ e);
	}

	public static void main(String[] args) {
		// TODO 값에 의한 전달2 : 인스턴스 변수를 이용하는 방법
		
		CallByTest1 call = new CallByTest1();
		call.display();	//인스턴스 변수로 지정이 되었기 때문에 인자값도 넣을 필요x
	}
}
*/

class Data{
	int a=4; 
	double b=3.14; 
	char c=15;
	boolean d=true; 
	String e ="홍길동";
}

public class CallByTest1{
	void display(Data data) {
		System.out.println(data.a+","+ data.b+ ","+ data.c +","+ 
				data.d +","+ data.e);
	}

	public static void main(String[] args) {
		// TODO 값에 의한 전달3 : 클래스를 이용하는 방법
		
		Data data = new Data();
		
		CallByTest1 call = new CallByTest1();
		call.display(data);	
	}
}






