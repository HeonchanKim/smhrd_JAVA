package 배열실습;

public class Ex04_배열실습3 {
	public static void main(String[] args) {
		
		// 1. 배열생성(크기 9, int타입)
		int[] arr = {10,20,30,40,50,60,70,80,90};
		
		int sum = 0; // 초기화
		
		// 2. 총합 (배열안에 들어가있는 데이터 값들의 합)
		for(int i = 0;i < arr.length;i++) {
			// 배열 데이터값의 총합 구하기
			sum += arr[i];
		}
		// sum 출력
		System.out.println("총합 : " + sum);
		
		// 3. 총합을 이용해서 평균
		System.out.println("평균 : " + (sum/arr.length));

	}
}
