package �ݺ���;

import java.util.Scanner;

public class Ex04while��_����4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ : ");
		int cur = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();
		
		int week = 1;
		int weight = 0;
		while(cur>goal) {
			System.out.print(week+"���� ���� ������ : ");
			weight = sc.nextInt();
			week++;
			cur -= weight;
		}
		System.out.println("���� ������ :" + cur);
		System.out.println("�����մϴ�!");
		
	}
}
