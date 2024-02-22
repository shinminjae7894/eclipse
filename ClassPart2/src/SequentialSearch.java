import java.io.IOException;

public class SequentialSearch {

	public static void main(String[] args) throws IOException {
		// TODO 순차검색
		char data[] = {'a','b','c','d','e','f','g','h'};
		
		System.out.println("찾고자 하는 문자: ");
		char search = (char)System.in.read();
		
		boolean result = false;
		int i;
		for(i=0;i<data.length;i++) {
			if(search == data[i]) {
				result = true; //찾았는지 결과만 표시한 후 밑에 다시 if문으로 결과값 출력
				break;
			}
			else {
				result = false;
				
			}
		}
		if(result == true) {
			System.out.println("찾았다"+(i+1)+"번째에 있다");
		}
		else {
			System.out.println("못찾았다");
		}

	}

}
