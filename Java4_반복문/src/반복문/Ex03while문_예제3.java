package �ݺ���;

import java.util.Scanner;

public class Ex03while��_����3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int odd=0;
		int even=0;
		while(true) {
			System.out.print("���� �Է� : ");
			int num1 = sc.nextInt();
			
			if(num1==-1) {break;}
			if(num1%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("¦�� �Ѽ� : "+even);
		System.out.println("Ȧ�� �Ѽ� : "+odd);
		
	}
}
