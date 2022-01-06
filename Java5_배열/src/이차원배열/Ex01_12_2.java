package 이차원배열;

import java.util.Iterator;

public class Ex01_12_2 {
	public static void main(String[] args) {

		// 5*5 배열을 선언
		int[][] arr = new int[5][5];
		int num = 21;
		
		for (int i = 4; i >= 0; i--) {
			for(int j = 4; j >= 0;j--) {
				arr[j][i] = num;
				num++;
			}
		} // end of for
		
		// 출력
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			 System.out.println();
		}
		
		
		
	}
}
