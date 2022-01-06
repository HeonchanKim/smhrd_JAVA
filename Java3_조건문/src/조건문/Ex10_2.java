package 조건문;

import java.util.Scanner;

public class Ex10_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		
		System.out.println("--메뉴--");
		System.out.print("1. 콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >>");
		int num1 = sc.nextInt();
		
		// 	전역변수	
		int change = 0;
		// 값을 초기화 : int -> 0 / String -> "", null(reference)
		if(num1 == 1) {
			change = money - 1800;
		}else if(num1 == 2) {
			change = money - 2000;			
		}else if(num1 == 3) {
			change = money - 1200;
		}
		
		if(change>=0) {
			System.out.println("잔돈 : "+ change);	
			
			int money_1000 = change/1000;
			int money_500 = change%1000/500;
			int money_100 = change%500/100;
			
			System.out.println("천원 : "+money_1000);
			System.out.println("오백원 : "+money_500);
			System.out.println("백원 : "+money_100);
			
		}else {
			System.out.println("돈이 부족해요");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
