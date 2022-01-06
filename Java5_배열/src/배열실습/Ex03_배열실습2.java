package 배열실습;

public class Ex03_배열실습2 {
	public static void main(String[] args) {

		// 1. 크기 10을가진 정수데이터만 담을 수있는 배열 생성
		// int[] arr = new int[10];
 		int[] arr = {45,37,95,103,5,12,17,28,56,59}; 
		
		for(int i = 0;i < arr.length;i++) {
			//3의배수?
			if(arr[i]%3==0) {
				System.out.println(arr[i]);
			}
		}
		
		
	}
}
