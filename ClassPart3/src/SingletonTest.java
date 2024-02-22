class SingletonDemo{
	private int i;
	//특별한 이유가없으면 private로 함,외부에서 사용하지 못하게
	
	private static SingletonDemo instance = new SingletonDemo();
	private SingletonDemo() {}
	//생성자를 막아버림
	
	public static SingletonDemo getInstance() {
		return instance;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Singleton Pattern
		
		SingletonDemo demo1 = SingletonDemo.getInstance();
		SingletonDemo demo2 = SingletonDemo.getInstance();
		
		System.out.println(demo1 == demo2);
		
	}

}
