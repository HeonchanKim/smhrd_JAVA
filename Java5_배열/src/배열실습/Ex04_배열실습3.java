package �迭�ǽ�;

public class Ex04_�迭�ǽ�3 {
	public static void main(String[] args) {
		
		// 1. �迭����(ũ�� 9, intŸ��)
		int[] arr = {10,20,30,40,50,60,70,80,90};
		
		int sum = 0; // �ʱ�ȭ
		
		// 2. ���� (�迭�ȿ� ���ִ� ������ ������ ��)
		for(int i = 0;i < arr.length;i++) {
			// �迭 �����Ͱ��� ���� ���ϱ�
			sum += arr[i];
		}
		// sum ���
		System.out.println("���� : " + sum);
		
		// 3. ������ �̿��ؼ� ���
		System.out.println("��� : " + (sum/arr.length));

	}
}
