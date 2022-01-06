package 연산자;

import java.util.Scanner;

public class Ex06삼항연산자_예제2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = (num%2==0)?"짝수":"홀수";
		
		System.out.printf("%d는(은) %s입니다.", num, result);
	}
}
