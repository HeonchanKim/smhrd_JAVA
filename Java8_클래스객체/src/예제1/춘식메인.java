package ����1;

public class ��ĸ��� {
	public static void main(String[] args) {
		
		// ��� ĳ����(��ü, �ν��Ͻ�) ����
		new ���(); //���Ÿ���� ��ü ����
		
		//��� ��ü�� �������� �����ϰ� �ִ� ���۷��� ���� ����
		��� cs = new ���();
		
		//���� �Ӽ� ���
		
		//������ ��� �ν��Ͻ��� ������ ����
		System.out.println(cs.level);
		
		//������ ��� �ν��Ͻ��� ���� ���(�޼ҵ�) ���
		cs.attack();
		
		//��� �ν��Ͻ��� �Ӽ��� �Ҵ�
		cs.name = "�� �����";
		cs.level = 20;
		cs.power = 50;
		
		System.out.println("�̸� : "+cs.name);
		System.out.println("���� : "+cs.level);
		System.out.println("���ݷ� : "+cs.power);
		
		cs.attack();
		
		
		��� cs2 = new ���("���2", 10, 50);
		
		cs2.attack();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
