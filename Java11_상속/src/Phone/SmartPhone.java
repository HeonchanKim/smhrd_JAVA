package Phone;

//��� : class Ŭ������ extends ����Ŭ������
//-> ����Ŭ������ ��ӹ޾Ƽ� ���ο� Ŭ���� �ۼ�
//-> ����Ŭ������ �ʵ�/�޼��带 ���� Ŭ������ ���� �������� �ʾƵ� ����� �� ����
public class SmartPhone extends Phone {
	//�ʵ�(�Ӽ�) : (����Ŀ, ����ũ) => phone, ī�޶�
	//�޼���(���) : (��ȭ�ϴ�, �����ϴ�) => phone, ���ͳ��ϴ�
	
	String camera;
	
	//SmartPhone�� ������ �ɋ� speaker �ʵ� ���� �ʱ�ȭ (LG)
	public SmartPhone() {
		super("LG"); //����Ŭ������ ������ ȣ��
		//���Ǿ��ϸ� ����Ŭ������ �⺻������ȣ��
		
		super.message();
		this.message();
	}
	
	public void internet() {
		System.out.println("���ͳ�����!");
	}
	
	public String getSpeaker() {
		//super: �θ���(�ʵ�, �޼���) ȣ��
		return super.getSpeaker();
	}
}
