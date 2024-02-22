public class StringTest2 {

	public static void main(String[] args) {
		// TODO String클래스 주요특징
		
		//동일한 인스턴스를 만들지않는다
		String str1 = "java";
		String str2 = new String("java");
		//똑같은 문자열을 쓸때는 또 생성하지않음,둘다 주소값 동일
		
		System.out.println(str1.equals(str2));//값 비교 String 클래스에서만 (원래는 주소를 비교)
		
		/*
		str1 = str2;//주소를 넘겨줘서 같게함
		System.out.println(str1==str2);//주소 비교
		*/
		System.out.println(str1==str2);
		//new로 생성함으로써 주소값을 다르게함
		
		//절대 수정 불가
		String str3 = "javu";
		str3 ="java";
		
		String str4 = str3.concat(" is number one");//다른위치에서 새로생성, 같은주소에서 수정이 된게아님
		System.out.println(str3==str4);//주소가 같지않음
		
		//수정 가능
		StringBuffer sb1 = new StringBuffer("java");//new를 꼭 써야함,안쓰면 인스턴스를 생성
		StringBuffer sb2 = sb1.append(" is number one");
		System.out.println(sb1==sb2);//수정되어 주소값 동일
	}

}
