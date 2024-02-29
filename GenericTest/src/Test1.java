import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		// TODO 미리 타입 체크
		
		ArrayList<String> list = new ArrayList<String>();
		//문자열만 쓰려고할때 Generic은 Generic으로 만들어진 곳에서만 사용가능
		list.add("hello");
		list.add("world");
		//...
		list.add("100");
		//..
		
		String str = null;
		for(int i=0;i<list.size();i++) {
			str = (String)list.get(i);
			System.out.println(str);
		}
	}
}
