package �ݺ���;

import java.util.Scanner;

public class Ex01while�� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//do-while��
		int num = 0;
		do {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
		}while(num<10);
		System.out.println("����!");
		

		
		/*
		int num=0;
		//������ while���ȿ� ���� ����
		while(true) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			
			//�ݺ����� �������� ����
			if(num >= 10) {
				break; 
				// break Ű���带 ������ ��� 
				// ���� ��ġ���� ���� ����� �ݺ����� ��������
			}
			
		}
		*/
		/*
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();		
		
		//2. �ݺ��� ����
		while(num1 < 10) {
			//1. �ݺ��Ǵ� ���� ã��
			System.out.print("���� �Է� : ");
			num1 = sc.nextInt();	
		}
		System.out.println("����!");
		*/
	}
}
