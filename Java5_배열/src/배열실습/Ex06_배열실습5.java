package 배열실습;

import java.util.Scanner;

public class Ex06_배열실습5 {
	public static void main(String[] args) {
		
		// 입력도구 불러오기
		Scanner sc = new Scanner(System.in);		
		
		int[] score = new int[5];
		int sum = 0;
		
		// 배열의 데이터 입력받기
		for(int k = 0; k < score.length;k++) {
			System.out.print((k+1)+"번째 입력>>");
			score[k]=sc.nextInt();
		}
		
		System.out.print("입력된 점수 : ");
		for(int i = 0;i < score.length;i++) {
			System.out.print(score[i] +"\t");
		}
		System.out.println();
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 0;i < score.length;i++) {
			sum += score[i];
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}		
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %.1f", (double)sum/score.length);

	}
}
