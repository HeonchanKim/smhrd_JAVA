package �޼���;

public class Ex07_Fibonacci {
	public static void main(String[] args) {
		
		// �ڿ��� �����ϴ� �Ǻ���ġ ����
		// ����?
		// ���� ���� : ���̰� �����ϰ� �����ϴ� ���� (2 4 6 8 10..)
		// ��� ���� (2 4 8 16 32...)
		// ���� ���� ��Ģ������ ����
		
		// �Ǻ���ġ ����
		// 1 1 2 3 5 8 13 21 34 55.....
		
		int num4 = 10;
		int result4 = fibonacci(num4);
		System.out.println("�Ǻ���ġ ������ " + num4 + "��° ���� " + result4);
	}
	
	public static int fibonacci(int num4) {
		if(num4 == 1) {
			return 1;
		}else if(num4 == 2) {
			return 1;			
		}else {
			return fibonacci(num4 - 2) + fibonacci(num4 - 1);
		}
		//else if����ϰԵȴٸ� else������ return�� �� �־���Ѵ�!!
		
	}
}
