package 이차원배열;

public class Ex00 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 4; j >= 0; j--) {
				arr[i][j] = num;
				num++;
			}
		}


		//출력
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			 System.out.println();
		}
		
		
		
		
	}
}
