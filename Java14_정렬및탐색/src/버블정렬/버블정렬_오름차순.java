package ��������;

import java.util.Arrays;

public class ��������_�������� {
	public static void main(String[] args) {

		int[] arr = {7,4,5,1,3};
		
		System.out.println("���� �� : " + Arrays.toString(arr));
		
		/*
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i+1]) { //��ȯ
				int temp; //�ӽð���
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		System.out.println("1ȸ�� : " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 2; i++) {
			if(arr[i] > arr[i+1]) { //��ȯ
				int temp; //�ӽð���
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		System.out.println("2ȸ�� : " + Arrays.toString(arr));
		*/
			
		for(int j = 1;j <= 4;j++) {
			int cnt = 0; //���� ȸ������ ��ȯ�� Ƚ�� 
			
			for (int i = 0; i < arr.length - j; i++) {
				if(arr[i] > arr[i+1]) { //��ȯ	- ��������
					// if(arr[i]<arr[i+1]){ 	- ��������
					int temp; //�ӽð���
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;	
					cnt++;
				}
			}	
			if(cnt == 0) {
				System.out.println("�̹� ���� �Ϸ�");
				break;
			}
			System.out.println(j + "ȸ�� : " + Arrays.toString(arr));
		}
	}
}