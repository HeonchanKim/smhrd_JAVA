package �ݺ���;

import java.util.Scanner;

public class Ex06while��_����6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 =0;
		int num2 =0;
		String op = "";
		String con = "";
		
		while(true) {
			System.out.print("����1 : ");
			num1 = sc.nextInt();
			System.out.print("����2 : ");
			num2 = sc.nextInt();
			System.out.print("������(+/-) : ");
			op = sc.next();
			
			if(op.equals("+")){
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1+num2);
			}else if(op.equals("-")) {			
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1-num2);
			}	
			
			System.out.println("����Ͻðڽ��ϱ�? (Y/N)");
			con = sc.next();
			
			if(con.equals("N")) {
				System.out.println("����");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
