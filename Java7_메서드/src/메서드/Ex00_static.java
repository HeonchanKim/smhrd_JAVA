package �޼���;

import java.util.Random;

public class Ex00_static {
	public static void main(String[] args) {

		//non-static �޼��� : �������� �˾ƾ� ȣ���� �� �ִ� �޼���
		//���� ����(��ü, �ν��Ͻ�) ���� - new Ű���� ���
		Random rd = new Random();
		//random �� ���� , rd ����ƽ����
		
		//������ ������ �������� �˰� �־������ ��밡��
		rd.nextInt();
		
		
		//Math Ŭ������ abs �޼��� ���
		//abs : static �޼���
		//new Ű���� x -> ��ü, �ν��Ͻ� ���� x -> �ٷ� ��밡��
		Math.abs(2);
		

	}
}
