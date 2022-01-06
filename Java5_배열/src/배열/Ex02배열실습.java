package 배열;

public class Ex02배열실습 {
	public static void main(String[] args) {

		//1. 정수형 배열 참조값 가지는 변수 선언
		int[] arr;
		
		//2. 크기가 10인 배열 생성
		arr = new int[10];
		
		//2-1. 만약에 배열 생성시 들어가야 하는 값을 알고 있다
		//arr = {1, 3, 5, 79, 12, 38};
		
		//3. 배열 초기화(값 할당) - 인덱스는 0부터 시작
		//다른값으로 초기화 시켜주지 않으면 기본적으로 0을 가지고 있음(int)
		arr[0] =10;
		arr[1] =1;
		arr[2] =20;
		arr[3] =12;
		arr[4] =20;
		arr[5] =14;
		arr[6] =32;
		arr[7] =40;
		arr[8] =23;
		arr[9] =90;
		
		//4. 배열 값 출력
		//length(속성) : 배열의 길이(크기)
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		for(int i = 0 ;i < arr.length;i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		
		int sum = 0; //누적합을 저장할 변수
		//5. 각 인덱스의 값을 모두 더하여 결과값을 출력
		for(int i = 0; i < arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		//6. 배열안 값의 평균
		System.err.println((double)sum/arr.length);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
