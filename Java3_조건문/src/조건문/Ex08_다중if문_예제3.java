package ���ǹ�;

import java.util.Scanner;

public class Ex08_����if��_����3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ� : ");
		int num1 = sc.nextInt();
		System.out.print("����/û��/��� : ");
		String str = sc.next();
		

		if(str.equals("����") && num1 >= 1800) {
			System.out.println("�����մϴ�");
		}else if(str.equals("û��") && num1 >= 1500) {
			System.out.println("�ݰ����ϴ�");
		}else if(str.equals("���") && num1 >= 1000) {
			System.out.println("�ȳ��ϼ���");
		}else {
			System.out.println("�ܾ��� �����մϴ�.");				
		}
		
		
		
		
		
	}
}
