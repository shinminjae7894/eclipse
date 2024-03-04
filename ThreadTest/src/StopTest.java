/*
class StopDemo implements Runnable{

	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("Thread is alive...");
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread is dead...");
		}
	}
}

public class StopTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드 강제 종료
		
		StopDemo demo = new StopDemo();
		Thread t = new Thread(demo);
		t.start();
		
		Thread.sleep(3000);
		
		t.stop();
	}
}
*/

/*
class StopDemo implements Runnable{

	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("Thread is alive...");
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread is dead...");
		}
	}
}

public class StopTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드 강제 종료
		
		StopDemo demo = new StopDemo();
		Thread t = new Thread(demo);
		t.start();
		
		Thread.sleep(3000);
		
		t.interrupt();//예외를 발생,throws 보다 try,catch가 일반적
	}
}
*/

class StopDemo implements Runnable{
	private boolean stopped = false;
	
	void off() {
		stopped = true;
	}
		
	@Override
	public void run() {
		try {
			while(!stopped) {
				System.out.println("Thread is alive...");
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread is dead...");
		}
	}
}

public class StopTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드 강제 종료
		
		StopDemo demo = new StopDemo();
		Thread t = new Thread(demo);
		t.start();
		
		Thread.sleep(3000);
		
		demo.off();
	}
}
