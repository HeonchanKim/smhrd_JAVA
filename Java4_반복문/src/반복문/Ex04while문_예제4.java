package 반복문;

import java.util.Scanner;

public class Ex04while문_예제4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int cur = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 1;
		int weight = 0;
		while(cur>goal) {
			System.out.print(week+"주차 감량 몸무게 : ");
			weight = sc.nextInt();
			week++;
			cur -= weight;
		}
		System.out.println("현재 몸무게 :" + cur);
		System.out.println("축하합니다!");
		
	}
}
