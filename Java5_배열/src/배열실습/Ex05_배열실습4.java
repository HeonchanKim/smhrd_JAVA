package �迭�ǽ�;

public class Ex05_�迭�ǽ�4 {
	public static void main(String[] args) {
		//�迭�� ����
		int[] arr = {23,45,95,17,6,89,47,56,68,71};		 
		
		//�迭���� ����
		
		//�ּҰ�
		//�ִ밪
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0;i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		
		
		
	}
}
