package �������迭;

import java.util.Iterator;

public class Ex01_12_1 {
	public static void main(String[] args) {

		// 5*5 �迭�� ����
		int[][] arr = new int[5][5];
		int num = 21;
		
		for (int i = 0; i < arr.length; i++) {
			// i���� 0,2,4 �϶��� �����Ͱ�(cnt) ����������
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
		
		// ���
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			 System.out.println();
		}
		
		
		
	}
}
