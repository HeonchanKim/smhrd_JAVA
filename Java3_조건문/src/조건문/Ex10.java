package ���ǹ�;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ݾ� : ");
		int money = sc.nextInt();
		
		System.out.println("--�޴�--");
		System.out.print("1. �ݶ�(1800��) 2.�Ŀ����̵�(2000��) 3.ź���(1200��) >>");
		int num1 = sc.nextInt();

		// 	��������	
		int change = 0;
		// ���� �ʱ�ȭ : int -> 0 / String -> "", null(reference)
		if(num1 == 1) {
			change = money - 1800;
		}else if(num1 == 2) {
			change = money - 2000;			
		}else if(num1 == 3) {
			change = money - 1200;
		}
		System.out.println("�ܵ� : "+ change);			
		
		
		
		
		
		
		
	}
}
