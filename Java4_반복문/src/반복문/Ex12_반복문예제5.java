package �ݺ���;

import java.util.Scanner;

public class Ex12_�ݺ�������5 {
	public static void main(String[] args) {

		
		// �Է¹��� ������ ����� ���
		// ��� -> ����� ������ ���������ϴ� 
		Scanner sc = new Scanner(System.in);
		
		// ������ �Է����ּ��� >>
		System.out.print("������ �Է����ּ��� >> ");
		int num = sc.nextInt();
		
		for(int i = 1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		
		
	}
}
