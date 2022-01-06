package 메서드;

import java.util.Scanner;

public class Ex01_예제1 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		
		//static 메서드 내에서 non-static 호출 -> 불가능
		//non-static 메서드 호출하려면 -> 객체,인스턴스 생성후 호출
		getMinusVal(num1, num2);
	}
	
	//non-static
	//접근제한자 정적(static) 반환타입 메서드이름(){}
	private static void getMinusVal(int a, int b) {
		System.out.println("결과 : " + (a-b));
	}
}
