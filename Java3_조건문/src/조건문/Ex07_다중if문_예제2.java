package ���ǹ�;

import java.util.Scanner;

public class Ex07_����if��_����2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ĺ� �Է� : ");
		String str = sc.next();
		
		//�񱳿����� -> �⺻Ÿ�Ժ��� �� ���
		if(str.equals("A")) {
			System.out.println("A�Է�");
		}else if(str.equals("B")){
			System.out.println("B�Է�");			
		}else if(str.equals("C")){
			System.out.println("C�Է�");
		}else {
			System.out.println("A,B,C�� �Է�");
		}
		
		
	}
}
