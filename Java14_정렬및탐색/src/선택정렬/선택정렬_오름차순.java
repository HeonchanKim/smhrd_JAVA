package ��������;

import java.util.Arrays;

public class ��������_�������� {
	public static void main(String[] args) {
		
		int[] arr = {7,4,5,1,3};
		
		System.out.println("���� �� = " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("���� �� = " + Arrays.toString(arr));
		
		int index = 0; //���ϴ� ���߿� ���� ���� ���� �ִ� �ε��� ��ȣ ��� 
		int min, temp;
		
		
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			System.out.println((i+1)+"��° ���� = " + Arrays.toString(arr));
		}
	}
}
