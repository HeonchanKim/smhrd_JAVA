package �޼���;

import java.util.Scanner;

public class Ex05_����5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �����Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �����Է� : ");
		int num2 = sc.nextInt();
		
		int result = largerNumber(num1, num2);
		System.out.println("�� ū����? >> " + result);
		
	}
	
	public static int largerNumber(int num1, int num2) {
		/*
		int result = 0;
		
		// num1�� num2���� ū�� ������ �Ǵ� -> ���ǹ�
		if(num1 > num2) {
			result = num1;
		}else {
			result = num2;
		}
		return result;
		*/
		// ���׿����� ��� ����
		return num1 > num2 ? num1 : num2;
	}
	
}
