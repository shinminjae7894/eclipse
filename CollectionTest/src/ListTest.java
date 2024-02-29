import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("carrie");
		list.add("kairo");
		list.add("kabbin");
		list.add("kairo");
		list.add("kariss");
		
		System.out.println("데이터의 갯수 : " + list.size());
		System.out.println(list.toString());
		//입력된 순서대로 출력
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		if(list.contains("kairo")) {
			System.out.println("찾았다");
			System.out.println(list.indexOf("kairo")+1+"번째 있다");
		}//contains : 관련있는, 관련이있으면 true
		else {
			System.out.println("못찾았다");
		}
		
		list.add(2,100);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
	}
}
