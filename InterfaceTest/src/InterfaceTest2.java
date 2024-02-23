import java.io.IOException;

interface Volume{
	void volumeUp(int vol);
	void volumeDown(int vol);
}

interface Power{
	void powerOn() throws IOException;
	void powerOff();
}

class TV implements Volume,Power{
	private int vol;
	
	public void volumeUp(int vol) {
		this.vol += vol;
		System.out.println("현재 TV볼륨을" + vol+"만큼 올렸습니다");
	}
	
	@Override //Annotation : 코드를 간단하게 표현하기 위한 방법,overriding을 체크해줌
	public void volumeDown(int vol) {
		this.vol -= vol;
		System.out.println("현재 TV볼륨을" + vol+"만큼 내렸습니다");
	}
	
	public void display() {
		System.out.println("현재 볼륨은" + vol + "입니다.");
	}

	@Override
	public void powerOn() throws IOException {
		System.out.println("전원이 켜졌습니다.");
		System.out.print("1.소리증가: 2.소리감소: ");
		char input = (char)System.in.read();
		if input==1{
			
		}
	
	}

	@Override
	public void powerOff() {
		System.out.println("전원이 꺼졌습니다.");
		
	}
}

class Radio{
	private int vol;
	
	public void volumeUp(int vol) {
		this.vol += vol;
		System.out.println("현재 Radio볼륨을" + vol+"만큼 올렸습니다");
	}
	
	public void volumeDown(int vol) {
		this.vol -= vol;
		System.out.println("현재 Radio볼륨을" + vol+"만큼 내렸습니다");
	}
	
	public void display() {
		System.out.println("현재 볼륨은" + vol + "입니다.");
	}
}

class Speaker{
	private int vol;
	
	public void volumeUp(int vol) {
		this.vol += vol;
		System.out.println("현재 Speaker볼륨을" + vol+"만큼 올렸습니다");
	}
	
	public void volumeDown(int vol) {
		this.vol -= vol;
		System.out.println("현재 Speaker볼륨을" + vol+"만큼 내렸습니다");
	}
	
	public void display() {
		System.out.println("현재 볼륨은" + vol + "입니다.");
	}
	
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		// 인터페이스를 이용한 표준화
		
		TV tv = new TV();
		tv.volumeUp(10);
		tv.volumeDown(5);
		tv.display();
		
		Radio radio = new Radio();
		radio.volumeUp(15);
		radio.volumeDown(7);
		radio.display();
	}
}


/*
 * 1. Power 인테페이스를 상속받아 Volume과 마찬가지로 오버라이딩을한다
 * 2. 소리를 높일 때 50이상 넘지않도록 한다.
 * 3. 소리를 낮출 때 0 미만으로 줄일 수 없도록 한다.(0. 뮤트기능)
 * 4. 소리를 높이거나 낮출 때에는 전원이 켜져있는 상태에서만 가능하게 한다
 * ----------------------------------------------
 * 제품 선택
 * 1.TV
 * 2.Radio
 * 3.Speaker
 * 선택:_
 * 
 * TV 저원을 켜시겠습니까(Y/N) :_
 * 
 * 전원이 켜져있다면
 * 1. 소리 증가
 * 2. 소리 감소
 * 선택:_
 * 
 * 현재~의 볼륨은 ~만큼 올렸습니다.(내렸습니다.)
 * 현재 볼륨은 ~입니다.
 */
