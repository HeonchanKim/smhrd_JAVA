package Thread;

public class Ari2 implements Runnable {
	private String skill;
	
	public Ari2(String key) {
		skill = key;
	}
	
	//ThreadŬ���� run() �޼��� �������̵�(������)
	//run() -> ������(�����۾�) �ڵ�
	//������� run() �޼��� �������� ������ �����ϰ� run() ����Ǹ� �����嵵 ����
	//�������̵� ���������� Thread Ŭ������ �ۼ��� run()�� ȣ���ϰ� �Ǹ�
	//�̶� run()�� �ƹ��ϵ� ���� �ʰ� �����带 �ٷ� ����
	public void run() {
		System.out.println("�Է� Ű : " + skill);
		for(int i = 1;i <= 3;i++) {
			System.out.println(skill + "��ų ��� �� : " + i + "s");
		}
		System.out.println(skill + "��ų ��� ����");
	}
}
