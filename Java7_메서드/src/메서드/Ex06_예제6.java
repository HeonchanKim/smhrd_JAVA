package �޼���;

public class Ex06_����6 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		// is�޼��� -> ��ȯ�ϴ� Ÿ���� boolean
		boolean result = isDivisor(num1, num2);
		System.out.println(result);
		
		// ����ϴ� ����� ���ִ� �޼��带 ������ -> void
		getDivisor(24);
		
		//getSumOfDivisor()�޼���
		int num = 24;
		int result2 = getSumOfDivisor(num);
		//����Ÿ�� -> int
		System.out.println(num + "����� �� : " + result2);
		
		//isPerfectNumber
		// ������ => �ڱ��ڽ��� ������ ������� ���� �ڱ��ڽŰ� ���� ��
		// 6 -> 1+2+3+6 == 6 -> ������
		
		int num3 = 8128;
		boolean result3 = isPerfectNumber(num3);
		System.out.println("������? >> " + result3);
		
		int startNumber = 2;
		int endNumber = 1000;
		//2~1000������ �������� ������
		getPerfectNumber(startNumber, endNumber);
		
		
	}
	public static boolean isDivisor(int num1, int num2) {
		boolean result = false;
		//����, ������ ������ �����Ѵٸ�
		//num1�� num2�� ������ �� ������ ��������?
		//num2�� num1�� �����?
		//num1�� num2�� �����?
		
		if(num1 % num2 == 0) {
			result = true;
		}
		return result;
	}
	public static void getDivisor(int num) {
		String result = "";
		result += num + "�� ��� : ";
		//�� result�� 24�� ��� (1,2,3,4,6,8,12,24)
		
		for(int i = 1;i <= num;i++) {
			// i�� ������� �ƴ���
			// num%i==0 -> isDivisor
			if(isDivisor(num,i)) {
				result += i + " ";
			}
		}
		System.out.println(result);
		
	}
	public static int getSumOfDivisor(int num){

		int result2 = 0;
		
		for(int i = 1;i <= num;i++){
			if(isDivisor(num, i)){
				result2 += i;
			}		
		}
		return result2; 
	}
	public static boolean isPerfectNumber(int num3) {
		boolean result3 = false;
		//����, num�� ��������� true�� ����!
		//��������?
		//�ڱ��ڽ��� ������ ����� ���� �ڱ��ڽŰ� ������
		//������ ���θ� �Ǵ��ϴ� �޼��带 ������ּ���
		
		if(getSumOfDivisor(num3)-num3 == num3) {
			return true;
		}
		
		return result3;
	}
	public static void getPerfectNumber(int startNumber, int endNumber){
		String result = "";
		result += startNumber+"~"+endNumber+"������ ���� �� : ";
	
		for (int i = startNumber; i <= endNumber; i++) {
			if(isPerfectNumber(i)){
				result += i + " ";
			}
		}
		System.out.println(result);
	}
}//end of class











