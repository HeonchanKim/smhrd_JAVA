package Thread;

//���ÿ� �������� ��ų�� ����� �� ���� -> ��Ƽ�½�ŷ -> ��Ƽ���μ��� / ��Ƽ������(�ڹ�)
//��Ƽ������ �ۼ� ù��° ���1. Thread Ŭ������ ���
public class Ari extends Thread{
	private String skill;
	
	public Ari(String key) {
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