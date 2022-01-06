package 반복문;

import java.util.Scanner;

public class Ex13_369Game {
	public static void main(String[] args) {

		// 1 ~ 50까지 정수를 출력 해야함
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i <= 50;i++) {
			if(i%10==3 || i%10==6 || i%10==9) {
				System.out.println("박수");
			}else if(i%10==5){
				System.out.println("으악");				
			}else {
				System.out.println(i);
			}
		}
		

		
	}
}
