public class Phone {

	public static void main(String[] args) {
		// TODO 전화번호부
		
		//1차원 3개를 묶어서 2차원,2차원 4개를 묶어서 3차원, String: 1차원 [][]두개 추가해서 3차원
		String[][] phoneNumber ={{"Tom","555-1111","Newyork"},
		{"hong","555-2222","서울시 강남구"},
		{"kim","555-3333","서울시 강동구"},
		{"lee","555-4444","서울시 강북구"}};
		
	
		boolean result = false;
		int i =0;
		for(i=0;i<phoneNumber.length;i++) {
			if(args[0].equals((phoneNumber)[i][0])) {
				result= true;
				break;
			}
			
			else
				result = false;
			
		}
		if(result == true) {
			System.out.println("이름 :" + phoneNumber[i][0]
					+"전화번호 :" + phoneNumber[i][1] + " 주소 :" + phoneNumber[i][2] );
		}
		else {
			System.out.println("찾는 이름이 없습니다");
		}
		
		/*
		 * java Phone hong
		 * 이름 : hong
		 * 전화번호 : 555-2222
		 * 주소 : 서울시 강남구
		 * 
		 * java Phone choi
		 * 찾는 이름이 없습니다.
		 */
	}

}
