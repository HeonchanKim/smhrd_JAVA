package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class Ex07while��_����7_3 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int ran1 = rd.nextInt(10);
		int ran2 = rd.nextInt(10);
		
		Scanner sc = new Scanner(System.in);
		int sum = ran1 + ran2;
		int num1 = 0;
		String y_n = "";
		
		while(true) {
			
			System.out.print(ran1 + " + " + ran2 + " = ");
			num1 = sc.nextInt();
			
			if(num1 == sum) {
				System.out.println("Success!");
			}else {
				System.out.println("Fail!");			
			}
			
			System.out.print("����Ͻðڽ��ϱ�? ");
			y_n = sc.next();
			if(y_n.equals("N")) {
				break;
			}
		}
		System.out.println("����!");
		
		
		
		
	}
}
