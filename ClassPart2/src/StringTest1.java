public class StringTest1 {

	public static void main(String[] args) {
		// TODO String클래스 사용법
		
		//char name1[] = {'홍','길','동'};
		//for(int i=0;i<name1.length;i++) {
		//	System.out.println(name1[i]);
		//	}
		
		String name1 = new String();
		name1 = "홍길동";
		System.out.println(name1);
		
		String name2 = new String("임꺽정");
		System.out.println(name2);
		
		String name3 = "김수한무거북이와두루미";
		System.out.println(name3);
		
		String[] names = new String[3];
		names[0] = "홍길동";
		names[1] = "임꺽정";
		names[2] = "김수한무거북이와두루미";
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
			
		System.out.println("김수한무거북이와두루미".length());
		//문자열자체가 객체기때문에 .사용가능
		}
				
				
	}

}
