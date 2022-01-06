package 조건문;

import java.util.Scanner;

public class Ex10 {
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
		System.out.println("잔돈 : "+ change);			
		
		
		
		
		
		
		
	}
}
