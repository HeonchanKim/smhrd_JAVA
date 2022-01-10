package Product;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ��ǰ ���� : ");
		int num = sc.nextInt();
		
		Product[] p_arr = new Product[num];
		int total = 0;
		
		for (int i = 0; i < p_arr.length; i++) {
			System.out.print((i+1)+ ") ���� �̸� : ");
			String name = sc.next();
			
			System.out.print((i+1)+ ") �ܰ� : ");
			int unitPrice = sc.nextInt();
			
			System.out.print((i+1)+ ") ���� : ");
			int amount = sc.nextInt();
			
			p_arr[i] = new Product(name, unitPrice, amount);
			System.out.println();
		}
		
		System.out.println("��ǰ��\t�ܰ�\t����");
		for (int i = 0; i < num; i++) {
			System.out.printf("%s\t%d\t%d\n",p_arr[i].getName(), p_arr[i].getUnitPrice(), p_arr[i].getAmount());
			total += p_arr[i].getUnitPrice() * p_arr[i].getAmount();
		}
		System.out.println("�� �ݾ� : " + total);
		
	}
}
