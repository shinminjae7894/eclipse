
public class BubbleSort {

	public static void main(String[] args) {
		// TODO 배열 정렬
		
		int[] data = {8, 7, 9, 2, 3, 6};
		
		long start = System.nanoTime();
		for(int row=0;row<data.length-1;row++){
			for(int col=0; col<data.length-1; col++) {
				if(data[col]> data[col+1]) {
					//자리바꿈,부등호는 오름차순 내림차순
					int temp = data[col];
					data[col] = data[col+1];
					data[col+1]= temp;
				
				}
		}

	}
	long end = System.nanoTime();
	System.out.println("정렬 후...");
	for(int i=0; i<data.length; i++) 
		System.out.print(data[i] + "\t");
	
	System.out.println("\n\n걸린시간: "+(end - start) + "ns");
	}

}
