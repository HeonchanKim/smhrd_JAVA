package EPoketmon;

public interface Epoketmon { // ��ü ���� �Ұ���

	//�������̽� �������� ����� ���� ���� (final)
	//����� ������ ������ �� �ʱ�ȭ ���������
	final String type = "����";
	int level = 1; //���
	//�������̽� ������ ���������� �Ұ����ϱ⶧���� final Ű���� �Ⱥٿ���
	//����� ���� (�ʱ�ȭ ���������)
	
	//�������̽� �������� �߻�޼��� ���𰡴�
	public abstract void attack();
	public void moving(); 
	// abstract Ű���� ������ �ʾƵ� �߻�޼���� �����
	// �Ϲݸ޼���� {}�� �־����!
	
	//java8���� �̻���ʹ� �Ϲݸ޼��嵵 ���� ����
	//(default, static)
	//default : ���������ڰ� �ƴ϶� �������̽������� �Ϲݸ޼��带
	//������ �� �ְ� ���ִ� Ű����
	public default void hello() {
		System.out.println("�ȳ�");
	}
	
	public static void hello1() {
		System.out.println("�ȳ�1");
	}
}