package �迭�ǽ�;

import java.util.Scanner;

public class Ex06_�迭�ǽ�5 {
	public static void main(String[] args) {
		
		// �Էµ��� �ҷ�����
		Scanner sc = new Scanner(System.in);		
		
		int[] score = new int[5];
		int sum = 0;
		
		// �迭�� ������ �Է¹ޱ�
		for(int k = 0; k < score.length;k++) {
			System.out.print((k+1)+"��° �Է�>>");
			score[k]=sc.nextInt();
		}
		
		System.out.print("�Էµ� ���� : ");
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
		System.out.println("�ְ� ���� : " + max);
		System.out.println("���� ���� : " + min);
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.1f", (double)sum/score.length);

	}
}
