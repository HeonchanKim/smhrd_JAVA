package �޼���;

import java.util.Scanner;

public class Ex01_����1 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		
		//static �޼��� ������ non-static ȣ�� -> �Ұ���
		//non-static �޼��� ȣ���Ϸ��� -> ��ü,�ν��Ͻ� ������ ȣ��
		getMinusVal(num1, num2);
	}
	
	//non-static
	//���������� ����(static) ��ȯŸ�� �޼����̸�(){}
	private static void getMinusVal(int a, int b) {
		System.out.println("��� : " + (a-b));
	}
}
