package Person;

public class Student extends Person{
	
	String stdId = "123";
	String grade;
	
	//Student ��ü ������ �� String Ÿ���� �Ű����� �ϳ� �ްڴ�!
	public Student(String name) {
		//�Ű������� ���� ���� ����Ŭ����(�θ�Ŭ����)�� ������ ȣ��� ���
		super(name);
	}
	
	@Override
	public void walk() {
		System.out.println("�ɾ �б�����");
	}
	
	
}
