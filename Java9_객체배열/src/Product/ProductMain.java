package Product;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 상품 종류 : ");
		int num = sc.nextInt();
		
		Product[] p_arr = new Product[num];
		int total = 0;
		
		for (int i = 0; i < p_arr.length; i++) {
			System.out.print((i+1)+ ") 물건 이름 : ");
			String name = sc.next();
			
			System.out.print((i+1)+ ") 단가 : ");
			int unitPrice = sc.nextInt();
			
			System.out.print((i+1)+ ") 수량 : ");
			int amount = sc.nextInt();
			
			p_arr[i] = new Product(name, unitPrice, amount);
			System.out.println();
		}
		
		System.out.println("제품명\t단가\t수량");
		for (int i = 0; i < num; i++) {
			System.out.printf("%s\t%d\t%d\n",p_arr[i].getName(), p_arr[i].getUnitPrice(), p_arr[i].getAmount());
			total += p_arr[i].getUnitPrice() * p_arr[i].getAmount();
		}
		System.out.println("총 금액 : " + total);
		
	}
}
