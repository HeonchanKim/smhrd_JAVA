package ������;

import java.util.Scanner;

public class Ex04���������_����10 {
	public static void main(String[] args) {
		
		//ctrl+shift+o : ��ü import
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է�: ");
		int time = sc.nextInt();
		
		int hour = time/3600;
		int minute = time%3600/60;
		int second = time%60; //time%3600%60
		
		System.out.printf("%d�� %d�� %d��", hour, minute, second);
		
	}
}
