package �޼���;

import java.util.Scanner;

public class Ex02_����2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		
		int result = getAbsoluteVal(num1, num2);
		System.out.println("��� = " + result);
	}
	
	//�Ű����� : �ΰ��� ����(int - 2) 
	//��ȯ�� : ����
	public static int getAbsoluteVal(int a, int b) {
		// ���� ������ ���
		// int result = a >= b ? a - b : (a - b) * -1; 
		int result = Math.abs(a - b);
		return result;
	}
}
