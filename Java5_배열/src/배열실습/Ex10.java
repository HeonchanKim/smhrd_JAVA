package �迭�ǽ�;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		
		int[] arr1 = new int[5]; // ����ڰ� �Է��� ���� ����
		int[] arr2 = {1,2,3,4,5}; // ���� ��
		int cnt = 0;
		
		for(int i = 0;i < arr1.length;i++ ) {
			System.out.printf("%d��° �� >> ",i+1);
			arr1[i] = sc.nextInt();
		}
		System.out.println("����Ȯ��");
		
		for(int i = 0;i < arr1.length;i++) {
			if(arr1[i] == arr2[i]) {
				System.out.print("O ");
				cnt++;
			}else {
				System.out.print("X ");				
			}
		}
		System.out.printf("�� �� : %d", cnt*20);
		
		
		
		
		
	} // end of main
}
