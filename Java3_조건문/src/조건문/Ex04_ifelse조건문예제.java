package ���ǹ�;

import java.util.Scanner;

public class Ex04_ifelse���ǹ����� {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA ���� �Է� : ");
		int javaScore = sc.nextInt();
		System.out.print("Python ���� �Է� : ");
		int pythonScore = sc.nextInt();
		System.out.print("Android ���� �Է� : ");
		int androidScore = sc.nextInt();
		
		int avg = (javaScore+pythonScore+androidScore)/3;
		
		if(avg >= 80) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		
	}
}
