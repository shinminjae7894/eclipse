public class Sungjuk_v2 {

	public static void main(String[] args) {
		// TODO 2차원 배열을 이용한 성적표
		
		String[] names = {"홍길동","임꺽정","신돌석"};
		char[] grade = new char[3];
		
		//int[][] sungjuk = new int[3][6];
		int[][] sungjuk = {
				{1,98,90,0,0,0},
				{2,76,55,0,0,0},
				{3,85,73,0,0,0}
		};
		
		//총점
		for(int i=0; i<sungjuk.length;i++) {
			sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2];
		}
		//평균
		for(int i=0; i<sungjuk.length;i++) {
			sungjuk[i][4] = (sungjuk[i][3])/2;
		}
		//학점
		for(int i=0;i<sungjuk.length;i++) {
			if(sungjuk[i][4] >=90)
				grade[i]='A';
			else if (sungjuk[i][4]>=80)
				grade[i]='B';
			else if (sungjuk[i][4]>=70)
				grade[i]='C';
			else if (sungjuk[i][4]>=60)
				grade[i]='D';
			else 
				grade[i]='F';
			}
		//등수
		
		for(int i=0;i<sungjuk.length;i++) {
			sungjuk[i][5] = 1;
			for(int j=0;j<sungjuk.length;j++) {
				if(sungjuk[j][4] > sungjuk[i][4]) {
					sungjuk[i][5]++;
				}
			}
		}
		
		System.out.println("***성적표***");
		System.out.println("학번\t이름\t영어\t국어\t총점\t평균\t학점\t등수");
		System.out.println("---------------------------------------");
		
		long start = System.nanoTime();
			for(int i=0; i<sungjuk.length;i++) {
				System.out.println(sungjuk[i][0] + "\t" +names[i] + "\t" + sungjuk[i][1] + "\t" +sungjuk[i][2]+
						"\t"+sungjuk[i][3]+"\t"+sungjuk[i][4]+"\t"+grade[i] + "\t" + sungjuk[i][5]);
			}
		System.out.println("\n\n 정렬 후");
		for(int row=0;row<sungjuk.length-1;row++){
			for(int col= row+1; col<sungjuk.length; col++) {
				if(sungjuk[row][4]< sungjuk[col][4]) {
					int[] temp = sungjuk[row];
					sungjuk[row] =sungjuk[col];
					sungjuk[col] = temp;
					
					char chr_temp = grade[row];
					grade[row] = grade[col];
					grade[col] = chr_temp;
					
					String str_temp = names[row];
					names[row] = names[col];
					names[col] = str_temp;
				}
			}
		}
		System.out.println("***성적표***");
		System.out.println("학번\t이름\t영어\t국어\t총점\t평균\t학점\t등수");
		System.out.println("---------------------------------------");
		
		long end = System.nanoTime();
			for(int i=0; i<sungjuk.length;i++) {
				System.out.println(sungjuk[i][0] + "\t" +names[i] + "\t" + sungjuk[i][1] + "\t" +sungjuk[i][2]+
						"\t"+sungjuk[i][3]+"\t"+sungjuk[i][4]+"\t"+grade[i] + "\t" + sungjuk[i][5]);
			}
		}
}
	
