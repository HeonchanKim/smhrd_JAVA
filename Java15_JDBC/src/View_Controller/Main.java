package View_Controller;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================SMHRD�л��������α׷�=====================");
		
		while(true) {
			System.out.println("1.�л��߰� 2.��ü�����ȸ 3.Ư���л���ȸ 4.�л��������� 5.�л����� 6.���α׷�����");
			System.out.print("�޴� ���� >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("����� �л��� ������ �Է��Ͻÿ�");
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String tel = sc.next();
				System.out.print("�̸��� : ");
				String email = sc.next();
				
			}else if(menu == 2) {
				System.out.println("2������");
			}else if(menu == 3) {
				System.out.println("3������");
			}else if(menu == 4) {
				System.out.println("4������");
			}else if(menu == 5) {
				System.out.println("5������");
			}else if(menu == 6) {
				System.out.println("����Ǿ����ϴ�");
				break;
			}
		} // end of while
	}
}
