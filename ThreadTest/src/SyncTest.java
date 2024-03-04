class Toilet{
	public synchronized void openDoor(String name) {
		System.out.println(name + "가 화장실에 들어왔습니다.");
		
		for(int i=0;i<10000;i++) {
			if(i == 5000) {
				System.out.println(name + " : 끄응~~");
			}//synchronized써서 동기식 처리
		}
		
		System.out.println(name + "가 화장실에서 나갔습니다.");
	}
}

class Family extends Thread{
	

	Toilet toilet;
	String who;
	
	Family(Toilet t, String w){
		toilet = t;
		who = w;
	}
	
	@Override
	public void run() {
		toilet.openDoor(who);
	}
}

public class SyncTest {
	public static void main(String[] args) {
		// TODO 동기식 처리
		Toilet t = new Toilet();
		
		Family father = new Family(t, "아버지");
		Family mother = new Family(t, "어머니");
		Family brother = new Family(t, "형");
		Family syster = new Family(t, "누나");
		Family me = new Family(t, "나");
		
		father.start();
		mother.start();
		brother.start();
		syster.start();
		me.start();
	}
}
