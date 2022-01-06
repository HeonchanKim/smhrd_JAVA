package 배열실습;

public class Ex02_배열실습1 {
	public static void main(String[] args) {
		
		
		// 크기 9를 가진 배열을 생성
		// int
		// int[] arr = new int[9];
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		// 값이 60인곳의 인덱스 값을 출력해보자
		// 값이 60인지 아닌지 판단하기위해 사용할 것은 ? -> 조건문

		for(int i = 0;i < arr.length;i++) {
			if(arr[i]==60) {
				System.out.println(i);
			}
		}
		
		
		
		
		
	}
}
