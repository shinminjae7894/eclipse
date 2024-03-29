class FinishDemo2 implements Runnable{
	private String name;
	
	public FinishDemo2(String name){
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
		}
		while(cnt<10);
		
		System.out.println(name + "자식스레드 끝");
	}
	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
	
}

public class FinishTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드의 종료 시점 지정하기
System.out.println("메인 스레드 시작");
		
		FinishDemo2 child1 = new FinishDemo2("first");
		FinishDemo2 child2 = new FinishDemo2("second");
		
		Thread t1 = new Thread(child1);
		Thread t2 = new Thread(child2);
		
		t1.start();
		t2.start();
		
		int cnt = 0;
		do {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			cnt++;
			System.out.print(".");
		}//while(t1.isAlive() || t2.isAlive());//항상 메인 스레드가 늦게 끝나게
		while(cnt<10);//메인 스레드가 항상 먼저 끝남
		
		t1.join();//t1이 먼저끝날때까지 기다리게 만듦
		t2.join();
		
		System.out.println("메인 스레드 끝");
	}
}

