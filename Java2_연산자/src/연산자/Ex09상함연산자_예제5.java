package ������;

import java.util.Scanner;

public class Ex09���Կ�����_����5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		
		int money = time > 8 ? time*(int)(9000*1.5) : time*9000;
		System.out.printf("�� �ӱ��� %d�� �Դϴ�", money);
				
	}
}
