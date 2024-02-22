
public class ArrayTest {

	public static void main(String[] args) {
		// TODO 배열의 기본
		int no=1, kor=70, eng=55, mat=87;
		
		/*
		int[] arr = new int[4]; //주소로 저장,int arr[] = new int[4];
		arr[0] = 1;
		arr[1] = 70;
		arr[2] = 55;
		arr[3] = 87;
		*/
		
		int []arr = {1,70,55,87};//4개를 한번에 저장하는게 아님,시작주소값을 저장
		//배열을 객체로 저장하기 때문에 .을 활용할수 있음
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
 	}

}
