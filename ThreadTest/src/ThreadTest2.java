/*
class ThreadDemo2 extends Thread{
	
	ThreadDemo2(String name){
		super(name);
	}
	@Override
	public void run() {
		System.out.println(getName() + "자식스레드 시작");
		
		int cnt = 0;
		do {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cnt++;
			System.out.println(cnt);
		}while(cnt<10);
		
		System.out.println(getName() + "자식스레드 끝");
	}
	
}

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		ThreadDemo2 child1 = new ThreadDemo2();
		child1.start();
		
		int cnt = 0;
		do {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			cnt++;
			System.out.print(".");
		}while(cnt<10);
		
		System.out.println("메인 스레드 끝");
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
}
*/

class ThreadDemo2 implements Runnable{
	private String name;
	
	public ThreadDemo2(String name){
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name + "자식스레드 시작");
		
		int cnt = 0;
		do {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cnt++;
			System.out.println(cnt);
		}while(cnt<10);
		
		System.out.println(name + "자식스레드 끝");
	}
	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
	
}

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		ThreadDemo2 child1 = new ThreadDemo2("first");
		Thread t1 = new Thread(child1);
		t1.start();
		
		int cnt = 0;
		do {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			cnt++;
			System.out.print(".");
		}while(cnt<10);
		
		System.out.println("메인 스레드 끝");
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
}