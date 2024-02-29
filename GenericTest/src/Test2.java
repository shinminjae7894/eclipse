class GenericDemo<T>{
	private T value;
	//정적 바인딩(int라는 고정값), 동적바인딩(Template)으로 바꿔줘야함
	
	public GenericDemo(T v) {
		value = v;
	}
	
	T getValue() {
		return value;
	}
}

public class Test2 {
	public static void main(String[] args) {
		// Generic Class만들기
		GenericDemo<Integer> demo1 = new GenericDemo<Integer>(10);
		System.out.println(demo1.getValue());
		
		GenericDemo<Double> demo2 = new GenericDemo<Double>(3.14);
		System.out.println(demo2.getValue());
		
		GenericDemo<String> demo3 = new GenericDemo<String>("100");
		System.out.println(demo3
				.getValue());
	}

}
