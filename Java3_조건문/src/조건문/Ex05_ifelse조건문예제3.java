package ���ǹ�;

import java.util.Scanner;

public class Ex05_ifelse���ǹ�����3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("����Ʈ���� ���� : ");
		int score1 = sc.nextInt();
		System.out.print("����Ʈ���� ���� : ");
		int score2 = sc.nextInt();
		System.out.print("�����ͺ��̽� ���� �Է� : ");
		int score3 = sc.nextInt();
		System.out.print("���α׷��� ��� Ȱ�� : ");
		int score4 = sc.nextInt();
		System.out.print("�����ý��� ���� ���� : ");
		int score5 = sc.nextInt();
		
		boolean condition1 = (score1 >= 8 && score2 >= 8 && score3 >= 8 && score4 >= 8 && score5 >= 8);
		int condition2 = score1+score2+score3+score4+score5;
		
		if(condition1 && condition2 >= 60) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}
}
