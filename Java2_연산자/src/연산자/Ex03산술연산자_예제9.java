package ������;

import java.util.Scanner;

public class Ex03���������_����9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("JAVA ���� �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("WEB ���� �Է�: ");
		int num2 = sc.nextInt();
		System.out.print("ANDROID ���� �Է�: ");
		int num3 = sc.nextInt();
		
		int sum =num1+num2+num3;
		double avg =sum/3;
		
		System.out.println("�հ� : " +sum);
		System.out.printf("��� : %.2f", avg) ;
		
	}
}
