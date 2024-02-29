import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("k1","홍길동");
		map.put("k2","임꺽정");
		map.put("k3","유비");
		map.put("k4","관우");
		map.put("k5","장비");
		
		System.out.println("데이터의 갯수 : " + map.size());
		System.out.println(map.toString());
		
		System.out.println(map.get("k2"));//데이터 조회
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			String key = (String)it.next();//Object key = it.next();
			System.out.println(map.get(key));
		}
	}
}
