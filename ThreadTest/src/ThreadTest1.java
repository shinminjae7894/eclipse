/*
class ThreadDemo extends Thread{
	//private String name;
	
	public ThreadDemo(String name) {
		//this.name = name;
		super(name);//상속을 받았으니 부모에 저장
	}
	
	//override
	public void run() {
		int sum = 0;
		for(int i=0; i<5; i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //잠깐 쉬게함,오버라이드에선 throws를 쓸수 없음
			sum += i;
			System.out.println(getName() + " : " + sum);
		}
	}
	
}//thread를 상속받음

public class ThreadTest1 {
	public static void main(String[] args) {
		ThreadDemo demo1 = new ThreadDemo("first");
		ThreadDemo demo2 = new ThreadDemo("second");
		//thread 3개, 동시 실행하게 하면 멀티스레드 생성
		
		demo1.start();
		demo2.start();//timesharing 동시에 실행되는 것처럼 보임
	}
}
*/

class ThreadDemo implements Runnable{
	private String name;
	
	public ThreadDemo(String name) {
		this.name = name;
		//super(name);//Runnable은 추상클래스, 생성자가없으므로 생성자 호출 안됨
	}
	
	//override
	public void run() {
		int sum = 0;
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //잠깐 쉬게함,오버라이드에선 throws를 쓸수 없음
			sum += i;
			System.out.println(name + " : " + sum);
		}
	}
}

//thread를 상속받는 두번째 방법 : runnable을 이용해서
public class ThreadTest1{
	public static void main(String[] args) {
		ThreadDemo demo1 = new ThreadDemo("first");
		ThreadDemo demo2 = new ThreadDemo("second");
		
		Thread t1 = new Thread(demo1);
		Thread t2 = new Thread(demo2);
		
		t1.start();
		t2.start();//timesharing 동시에 실행되는 것처럼 보임
	}
}
