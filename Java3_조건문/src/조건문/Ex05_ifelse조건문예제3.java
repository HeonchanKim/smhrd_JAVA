package 조건문;

import java.util.Scanner;

public class Ex05_ifelse조건문예제3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("소프트웨어 설계 : ");
		int score1 = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int score2 = sc.nextInt();
		System.out.print("데이터베이스 구축 입력 : ");
		int score3 = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int score4 = sc.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int score5 = sc.nextInt();
		
		boolean condition1 = (score1 >= 8 && score2 >= 8 && score3 >= 8 && score4 >= 8 && score5 >= 8);
		int condition2 = score1+score2+score3+score4+score5;
		
		if(condition1 && condition2 >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
}
