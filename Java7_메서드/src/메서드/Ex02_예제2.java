package 메서드;

import java.util.Scanner;

public class Ex02_예제2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		
		int result = getAbsoluteVal(num1, num2);
		System.out.println("결과 = " + result);
	}
	
	//매개변수 : 두개의 정수(int - 2) 
	//반환값 : 정수
	public static int getAbsoluteVal(int a, int b) {
		// 삼항 연산자 사용
		// int result = a >= b ? a - b : (a - b) * -1; 
		int result = Math.abs(a - b);
		return result;
	}
}
