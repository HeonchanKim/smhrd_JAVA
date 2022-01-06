package 배열실습;

public class Ex05_배열실습4 {
	public static void main(String[] args) {
		//배열을 생성
		int[] arr = {23,45,95,17,6,89,47,56,68,71};		 
		
		//배열값에 접근
		
		//최소값
		//최대값
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0;i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
	}
}
