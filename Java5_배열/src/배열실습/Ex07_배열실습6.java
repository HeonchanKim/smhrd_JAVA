package �迭�ǽ�;

import java.util.Random;

public class Ex07_�迭�ǽ�6 {
	public static void main(String[] args) {
		
		// ���� ���ڸ� �ҷ����ִ� ����
		Random rd = new Random();
		
		System.out.println("====�ζ�Ÿ��====");
		System.out.println("�̹��� ��º�ȣ�¿�...!!�α��α��α�!!!!");
		
		//5���� ���� ���ڸ� ������ �� �ִ� �迭 ����
		int[] arr = new int[5];
		
		//�ߺ����� �����ؾ��մϴ�.
		for(int i = 0;i < arr.length;i++) {
			// 0 ~ 10
			// 1 ~ 10
			arr[i]= rd.nextInt(9)+1;
			for(int j = 0; j < i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		//�迭 ���
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
		
		
	}
}
