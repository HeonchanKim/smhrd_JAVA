package �������迭;

public class Ex04_���������迭 {
	public static void main(String[] args) {
		
		//�迭�� ���� -> 4��
		
		//�������� �迭 ������ ���ۺ��� ���� ���
		//�� �迭�� ���̰� �ٸ��� ������ ������ ���� ������ �� ����
		int[][] arr = new int[4][];

		
		//������(��������)�迭�� ���� �˰� �ִ� ��쿡�� 
		//�迭�����Ŀ� �ٷ� ���۷��� ���� ���� ����
		int[][] a = {{1},{1,2},{1,2,3}}; //����
		
		for (int i = 0; i < a.length; i++) { // 1���� �迭�� ����
			for (int j = 0; j < a[i].length; j++) { //�� �迭�� ����
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		arr[0] = new int[3];
		arr[1] = new int[5];
		// arr[1] = {3,2,1,4,5}; �Ұ���!!!
		arr[2] = new int[4];
		arr[3] = new int[6];
		
		arr[0][0] = 70;
		arr[0][1] = 65;
		arr[0][2] = 80;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
