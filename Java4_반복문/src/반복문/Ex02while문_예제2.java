package 반복문;

import java.util.Scanner;

public class Ex02while문_예제2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 값을 누적시켜서 출력해야 된다! -> 0으로 초기화된 변수 선언
		int num=0;
		
		while(num!=-1) {
			sum +=num;			
			System.out.print("숫자 입력 :");
			num = sc.nextInt();
			// sum에 num값을 누적 (더해줌)
			;
		}
		System.out.println("누적 결과 : "+sum+1);
		
		while(true) {
			sum +=num;			
			System.out.print("숫자 입력 :");
			num = sc.nextInt();
			
			if(num==-1) {break;}
		}
		

		do {
			sum +=num;			
			System.out.print("숫자 입력 :");
			num = sc.nextInt();
		}while(num!=-1);
		
		
		
		
		
		
		
		
		
	}
}
