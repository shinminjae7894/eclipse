class ThreadDemo3 extends Thread{
	ThreadDemo3(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName()+":"+i);
		}
	}
}

//main 건드리지말기
public class ThreadTest3 {
	public static void main(String[] args) {
		// 문제
		ThreadDemo3 d1 = new ThreadDemo3("스레드1");
		ThreadDemo3 d2 = new ThreadDemo3("스레드2");
		ThreadDemo3 d3 = new ThreadDemo3("스레드3");
	}
}
