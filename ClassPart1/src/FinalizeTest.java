class FDemo{
	int count;
	
	FDemo(int i){
		count = i;
	}
	
	protected void finalize() {
		System.out.println("Garbage Collection 가동 :" + count);
	}
}

public class FinalizeTest {
	public static void main(String[] args) {
		// TODO Garbage Collection 확인

		for(int i=0;i<1000000; i++) {
			new FDemo(i);
		}
	}

}
