package ������;

import java.util.Scanner;

public class Ex06���׿�����_����2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = (num%2==0)?"¦��":"Ȧ��";
		
		System.out.printf("%d��(��) %s�Դϴ�.", num, result);
	}
}
