package �迭;

public class Ex01�迭���� {
	public static void main(String[] args) {
		
		// 1. �迭 ����
		// 2. �迭 ���۷��� ���� ���� (�迭�� �������� ����)
		char[] c = new char[3]; // �޸� ������ �������� 3ĭ ���� �Ҵ�
		
		//3. �迭�� �� �Ҵ�(�� �ε����� ����)
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		
		//4. �迭 ������ ���ÿ� �� �Ҵ�
		int[] i = {1, 5, 7, 3, 10}; // �ڵ����� �������� 5ĭ ���� �Ҵ�
		// �迭�� ũ�� ���� �Ұ���!
		
		//5. �迭ũ�� ���(length �ʵ�(�Ӽ�) Ȱ��)
		System.out.println("i �迭 ũ�� : " + i.length);
		
		System.out.println(i);
		System.out.println(c);
		
		
		int[] intArray = new int[5];
		int[] myArray = intArray;
		System.out.println("intArray ������ : " + intArray);
		System.out.println("myArray ������ : " + myArray);
		System.out.println(intArray[0]);
		
		intArray[1] = 2;
		System.out.println(intArray[1]);
		
		myArray[1] = 6;
		System.out.println(intArray[1]);
		
		
		
		
		
		
		
		
	}
}
