import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;//ctrl+shift+o

public class SetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		
		set.add("carrie");
		set.add("Kabbin");
		set.add("Kairo");
		set.add("Kairo");//중복된건 또 저장하지 않음
		set.add("Kariss");
		
		System.out.println("데이터의 갯수 : " + set.size());
		System.out.println(set.toString());
		
		TreeSet ts = new TreeSet();
		ts.add("juliet");
		ts.add("terry");
		ts.add("kabbin");
		ts.add("terry");
		ts.add("carrie");
		
		System.out.println("데이터의 갯수 : " + ts.size());
		System.out.println(ts.toString());
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
