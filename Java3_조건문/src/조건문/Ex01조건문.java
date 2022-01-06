package 조건문;

import java.util.Scanner;

public class Ex01조건문 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 20) { //(조건식) : 결과값이 true이면 if문을 실행
			// 조건식에는 boolean 값만 가능(비교, 논리 or true/false)
			System.out.println("성인입니다");
		}
		
	}
}
