package ������;

import java.util.Scanner;

public class Ex08���׿�����_����4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int result = num > 5? num/5+1 :1;
		System.out.println("�ʿ��� ������ �� : " + result);
	}
}
