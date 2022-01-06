package 조건문;

import java.util.Scanner;

public class Ex07_다중if문_예제2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 입력 : ");
		String str = sc.next();
		
		//비교연산자 -> 기본타입비교할 때 사용
		if(str.equals("A")) {
			System.out.println("A입력");
		}else if(str.equals("B")){
			System.out.println("B입력");			
		}else if(str.equals("C")){
			System.out.println("C입력");
		}else {
			System.out.println("A,B,C외 입력");
		}
		
		
	}
}
