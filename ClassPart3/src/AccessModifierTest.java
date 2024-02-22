class Employee{
	int no;
	public String name;
	private double salary;
	
	void setSalary(double sal) {
		salary = sal;
	}//private는 메서드를 달고다녀야함,
	//Setter method : private에 의해 막힌 변수에 값을 지정할 수 있는 메서드,접두사 set
	
	double getSalary() {
		return salary;
	}//private는 메서드를 달고다녀야함,Getter method : 값을 꺼내줄 수 있는 메서드,접두사 get
}//default 생략,허용한다는 뜻 public : 더 큰 허용

public class AccessModifierTest {

	public static void main(String[] args) {
		// TODO 접근 제어명시자 테스트
		Employee emp = new Employee();
		emp.no = 1234;
		emp.name = "홍길동";
		//emp.salary =1000000;//접근이 안됨
		emp.setSalary(1000000);
		System.out.println(emp.getSalary());
	}

}
