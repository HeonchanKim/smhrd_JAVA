package ¹Ýº¹¹®;

import java.util.Scanner;

public class Ex03while¹®_¿¹Á¦3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int odd=0;
		int even=0;
		while(true) {
			System.out.print("¼ýÀÚ ÀÔ·Â : ");
			int num1 = sc.nextInt();
			
			if(num1==-1) {break;}
			if(num1%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Â¦¼ö ÃÑ¼ö : "+even);
		System.out.println("È¦¼ö ÃÑ¼ö : "+odd);
		
	}
}
