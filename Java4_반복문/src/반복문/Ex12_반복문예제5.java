package 반복문;

import java.util.Scanner;

public class Ex12_반복문예제5 {
	public static void main(String[] args) {

		
		// 입력받은 정수의 약수를 출력
		// 약수 -> 어떤수를 나누어 떨어지게하는 
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력해주세요 >>
		System.out.print("정수를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		for(int i = 1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		
		
	}
}
