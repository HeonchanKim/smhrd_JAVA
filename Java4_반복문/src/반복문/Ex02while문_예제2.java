package �ݺ���;

import java.util.Scanner;

public class Ex02while��_����2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // ���� �������Ѽ� ����ؾ� �ȴ�! -> 0���� �ʱ�ȭ�� ���� ����
		int num=0;
		
		while(num!=-1) {
			sum +=num;			
			System.out.print("���� �Է� :");
			num = sc.nextInt();
			// sum�� num���� ���� (������)
			;
		}
		System.out.println("���� ��� : "+sum+1);
		
		while(true) {
			sum +=num;			
			System.out.print("���� �Է� :");
			num = sc.nextInt();
			
			if(num==-1) {break;}
		}
		

		do {
			sum +=num;			
			System.out.print("���� �Է� :");
			num = sc.nextInt();
		}while(num!=-1);
		
		
		
		
		
		
		
		
		
	}
}
