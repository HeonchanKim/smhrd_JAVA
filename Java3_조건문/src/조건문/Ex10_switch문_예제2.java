package ���ǹ�;

import java.util.Scanner;

public class Ex10_switch��_����2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("��(1~12) �Է� : ");
		int month = sc.nextInt();
		
		switch(month) {
			case 1: case 2: case 12:
				System.out.println("�ܿ�");
				break;
			case 3: case 4: case 5:
				System.out.println("��");
				break;
			case 6: case 7: case 8:
				System.out.println("����");
				break;
			case 9: case 10: case 11:
				System.out.println("����");
				break;
		}
		
		
		
		
		
		
	}
}
