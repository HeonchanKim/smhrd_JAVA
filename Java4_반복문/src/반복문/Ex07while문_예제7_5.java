package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class Ex07while��_����7_5 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int ran1 = rd.nextInt(10);
		int ran2 = rd.nextInt(10);
		
		Scanner sc = new Scanner(System.in);
		int sum = ran1 + ran2;
		int num1 = 0;
		String y_n = "";
		int s_count = 0;
		int f_count = 0;
		
		while(true) {
			
			System.out.print(ran1 + " + " + ran2 + " = ");
			num1 = sc.nextInt();
			
			if(num1 == sum) {
				System.out.println("Success!");
				s_count++;
			}else {
				System.out.println("Fail!");			
				f_count++;
			}
			
			System.out.print("����Ͻðڽ��ϱ�? ");
			y_n = sc.next();
			if(y_n.equals("N")) {
				break;
			}else if(y_n.equals("Y") && num1 == sum) {
				ran1 = rd.nextInt(10);
				ran2 = rd.nextInt(10);
				sum = ran1 + ran2;
			}
		}
		System.out.println("����!");
		System.out.println("���ᰳ�� : "+s_count);
		System.out.println("Ʋ������ : "+f_count);
		
		
		
		
	}
}
