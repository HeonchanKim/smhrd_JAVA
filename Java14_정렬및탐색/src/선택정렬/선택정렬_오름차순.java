package 선택정렬;

import java.util.Arrays;

public class 선택정렬_오름차순 {
	public static void main(String[] args) {
		
		int[] arr = {7,4,5,1,3};
		
		System.out.println("정렬 전 = " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("정렬 전 = " + Arrays.toString(arr));
		
		int index = 0; //비교하는 값중에 가장 작은 값이 있는 인덱스 번호 기억 
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
			System.out.println((i+1)+"번째 정렬 = " + Arrays.toString(arr));
		}
	}
}
