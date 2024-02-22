class Student {
	String name;
	int no;
	int kor;
	int eng;
	int tot;
	int avg;
	int rank;
	char grade;
	
	Student(String name, int no, int kor, int eng) {
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
	}
}

public class Sungjuk_V3 {

	public static void main(String[] args) {
		// TODO 클래스와 배열을 이용한 성적표
		Student[] students = new Student[3];//참조변수 3개 만듦
		students[0] = new Student("홍길동",1,98,90);//객체 생성, 생성자가 호출되어야함
		students[1] = new Student("임꺽정",2,76,55);
		students[2] = new Student("신돌석",3,85,73);
		
		//총점
		
		for(int i=0; i<students.length;i++){
			students[i].tot = students[i].kor + students[i].eng;
		}
		
		//평균
		for(int i=0; i<students.length;i++){
			students[i].avg = students[i].tot/2;
		}
		
		//학점
		for(int i=0;i<students.length;i++) {
			if(students[i].avg >=90)
				students[i].grade='A';
			else if (students[i].avg>=80)
				students[i].grade='B';
			else if (students[i].avg>=70)
				students[i].grade='C';
			else if (students[i].avg>=60)
				students[i].grade='D';
			else 
				students[i].grade='F';
			}
		
		//등수
		for(int i=0;i<students.length;i++) {
			students[i].rank = 1;
			for(int j=0;j<students.length;j++) {
				if(students[i].avg < students[j].avg ) {
					students[i].rank++;
				}
			}
		}
		System.out.println("***성적표***");
		System.out.println("학번\t이름\t영어\t국어\t총점\t평균\t학점\t등수");
		System.out.println("--------------------------------------------------------------------");
		
		long start = System.nanoTime();
			for(int i=0; i<students.length;i++) {
				System.out.println(students[i].no + "\t" +students[i].name + "\t" + students[i].eng + "\t" +students[i].kor+
						"\t"+students[i].tot+"\t"+students[i].avg+"\t"+students[i].grade + "\t" + students[i].rank);
			}
		System.out.println("\n\n 정렬 후");
		for(int row=0;row<students.length-1;row++){
			for(int col= row+1; col<students.length; col++) {
				if(students[row].rank> students[col].rank) {
					Student temp = students[row];
					students[row] = students[col];
					students[col] = temp;
				}
			}
		}
		System.out.println("***성적표***");
		System.out.println("학번\t이름\t영어\t국어\t총점\t평균\t학점\t등수");
		System.out.println("---------------------------------------");
		
		long end = System.nanoTime();
			for(int i=0; i<students.length;i++) {
				System.out.println(students[i].no + "\t" +students[i].name + "\t" + students[i].eng + "\t" +students[i].kor+
					"\t"+students[i].tot+"\t"+students[i].avg+"\t"+students[i].grade + "\t" + students[i].rank);
		}
		
	}

}
