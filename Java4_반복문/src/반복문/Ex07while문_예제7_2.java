package 반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex07while문_예제7_2 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int ran1 = rd.nextInt(10);
		int ran2 = rd.nextInt(10);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(ran1 + " + " + ran2 + " = ");
		int num1 = sc.nextInt();
		int sum = ran1 + ran2;
		
		if(num1 == sum) {
			System.out.println("Success!");
		}else {
			System.out.println("Fail!");			
		}
		
		
	}
}
