package 이차원배열;

import java.util.Iterator;

public class Ex01_12_3 {
	public static void main(String[] args) {

		// 5*5 배열을 선언
		int[][] arr = new int[5][5];
		int num = 21;

		for(int i = 0;i < arr.length;i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] =num;
				num++;
			}
		}
		
		
		// 출력
		for(int i = 0;i < arr.length;i++) {
			for(int k = 0;k < arr[i].length;k++) {
				System.out.print(arr[i][k]+"\t");
			}
			 System.out.println();
		}
		
		
		
	}
}
