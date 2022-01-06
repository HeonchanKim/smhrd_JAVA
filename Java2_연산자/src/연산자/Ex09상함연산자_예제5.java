package 연산자;

import java.util.Scanner;

public class Ex09상함연산자_예제5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("노동시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int money = time > 8 ? time*(int)(9000*1.5) : time*9000;
		System.out.printf("총 임금은 %d원 입니다", money);
				
	}
}
