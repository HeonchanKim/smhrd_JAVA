package 반복문;

import java.util.Scanner;

public class Ex01while문 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//do-while문
		int num = 0;
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
		}while(num<10);
		System.out.println("종료!");
		

		
		/*
		int num=0;
		//무조건 while문안에 로직 실행
		while(true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			//반복문을 빠져나갈 조건
			if(num >= 10) {
				break; 
				// break 키워드를 만나는 즉시 
				// 현재 위치에서 가장 가까운 반복문을 빠져나감
			}
			
		}
		*/
		/*
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();		
		
		//2. 반복할 조건
		while(num1 < 10) {
			//1. 반복되는 구문 찾기
			System.out.print("숫자 입력 : ");
			num1 = sc.nextInt();	
		}
		System.out.println("종료!");
		*/
	}
}
