package myutil;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		for(int i=0;i<5;i++) {
			System.out.println(r.nextInt());
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(r.nextInt(10));//0~9까지 10개의 숫자중의 임의로 5개
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(Math.random());//0~1사이의 랜덥값
		}
		
		//21~35 사이의 난수 : (최대값 + 최소값) + 최소값
		for(int i=0;i<5;i++) {
			System.out.println(r.nextInt(35-21)+21);
		}
	}
}
