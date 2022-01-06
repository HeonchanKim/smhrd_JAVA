package 메서드;

public class Ex07_Fibonacci {
	public static void main(String[] args) {
		
		// 자연상에 존재하는 피보나치 수열
		// 수열?
		// 등차 수열 : 차이가 동등하게 증가하는 수열 (2 4 6 8 10..)
		// 등비 수열 (2 4 8 16 32...)
		// 숫자 들이 규칙적으로 나열
		
		// 피보나치 수열
		// 1 1 2 3 5 8 13 21 34 55.....
		
		int num4 = 10;
		int result4 = fibonacci(num4);
		System.out.println("피보나치 수열의 " + num4 + "번째 항은 " + result4);
	}
	
	public static int fibonacci(int num4) {
		if(num4 == 1) {
			return 1;
		}else if(num4 == 2) {
			return 1;			
		}else {
			return fibonacci(num4 - 2) + fibonacci(num4 - 1);
		}
		//else if사용하게된다면 else에대한 return이 꼭 있어야한다!!
		
	}
}
