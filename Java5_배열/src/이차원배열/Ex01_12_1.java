package 이차원배열;

import java.util.Iterator;

public class Ex01_12_1 {
	public static void main(String[] args) {

		// 5*5 배열을 선언
		int[][] arr = new int[5][5];
		int num = 21;
		
		for (int i = 0; i < arr.length; i++) {
			// i행이 0,2,4 일때는 데이터가(cnt) 정방향으로
			if(i%2==0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num;
					num++;
				}				
			}else {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][4-j] = num;
					num++;
				}		
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
