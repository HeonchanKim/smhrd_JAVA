package Employee;

//abstract : �߻� Ű����
//�߻�Ŭ������ : Ŭ�������� �߻�޼��尡 �ϳ��� �ְų� Ŭ���� ����� abstract Ű���带
//���̸� �߻�Ŭ������ ��
public abstract class Employee {
	//�ʵ� : ���, �̸�, ����(�ϴ�/����)
	//�޼��� : ���ް���ϴ�(�߻�޼���-������), ��������ϴ�(���, �̸�, ����)
	String empno;
	String name;
	int pay;
	
	//�߻�޼��� : ���Ǵ� �Ǿ� ������ ����� ���� �޼���
	//�߻�޼��尡 �ִ� �߻� Ŭ������ ��ӹ��� ����Ŭ�������� �ʼ��� �������̵� �������(������)
	public abstract int getPay();
	
	public String print() {
		return empno + " : " + name + " : " + getPay();
	}
	
}
