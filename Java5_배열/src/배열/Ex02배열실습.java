package �迭;

public class Ex02�迭�ǽ� {
	public static void main(String[] args) {

		//1. ������ �迭 ������ ������ ���� ����
		int[] arr;
		
		//2. ũ�Ⱑ 10�� �迭 ����
		arr = new int[10];
		
		//2-1. ���࿡ �迭 ������ ���� �ϴ� ���� �˰� �ִ�
		//arr = {1, 3, 5, 79, 12, 38};
		
		//3. �迭 �ʱ�ȭ(�� �Ҵ�) - �ε����� 0���� ����
		//�ٸ������� �ʱ�ȭ �������� ������ �⺻������ 0�� ������ ����(int)
		arr[0] =10;
		arr[1] =1;
		arr[2] =20;
		arr[3] =12;
		arr[4] =20;
		arr[5] =14;
		arr[6] =32;
		arr[7] =40;
		arr[8] =23;
		arr[9] =90;
		
		//4. �迭 �� ���
		//length(�Ӽ�) : �迭�� ����(ũ��)
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		for(int i = 0 ;i < arr.length;i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		
		int sum = 0; //�������� ������ ����
		//5. �� �ε����� ���� ��� ���Ͽ� ������� ���
		for(int i = 0; i < arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		//6. �迭�� ���� ���
		System.err.println((double)sum/arr.length);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
