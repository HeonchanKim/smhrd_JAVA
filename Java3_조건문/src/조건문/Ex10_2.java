package ���ǹ�;

import java.util.Scanner;

public class Ex10_2 {
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
		
		if(change>=0) {
			System.out.println("�ܵ� : "+ change);	
			
			int money_1000 = change/1000;
			int money_500 = change%1000/500;
			int money_100 = change%500/100;
			
			System.out.println("õ�� : "+money_1000);
			System.out.println("����� : "+money_500);
			System.out.println("��� : "+money_100);
			
		}else {
			System.out.println("���� �����ؿ�");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
