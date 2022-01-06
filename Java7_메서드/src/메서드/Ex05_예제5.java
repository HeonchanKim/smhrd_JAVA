package 메서드;

import java.util.Scanner;

public class Ex05_예제5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수입력 : ");
		int num2 = sc.nextInt();
		
		int result = largerNumber(num1, num2);
		System.out.println("더 큰수는? >> " + result);
		
	}
	
	public static int largerNumber(int num1, int num2) {
		/*
		int result = 0;
		
		// num1이 num2보다 큰지 작은지 판단 -> 조건문
		if(num1 > num2) {
			result = num1;
		}else {
			result = num2;
		}
		return result;
		*/
		// 삼항연산자 사용 가능
		return num1 > num2 ? num1 : num2;
	}
	
}
