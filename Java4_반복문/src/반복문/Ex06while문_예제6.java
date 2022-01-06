package 반복문;

import java.util.Scanner;

public class Ex06while문_예제6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 =0;
		int num2 =0;
		String op = "";
		String con = "";
		
		while(true) {
			System.out.print("정수1 : ");
			num1 = sc.nextInt();
			System.out.print("정수2 : ");
			num2 = sc.nextInt();
			System.out.print("연산자(+/-) : ");
			op = sc.next();
			
			if(op.equals("+")){
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1+num2);
			}else if(op.equals("-")) {			
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1-num2);
			}	
			
			System.out.println("계속하시겠습니까? (Y/N)");
			con = sc.next();
			
			if(con.equals("N")) {
				System.out.println("종료");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
