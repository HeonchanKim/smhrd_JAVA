package ����1;

public class ��� {
	// ����� ĳ���� ����
	// �Ӽ�(field), �ൿ(method)
	//1. �Ӽ�(field) : �̸�, ����, ���ݷ�
	String name; //�̸��� �־�ߵ�!
	int level;
	int power;
	
	//������ : newŰ�������ؼ� ��ü�� �����Ҷ��� ȣ��Ǵ� �޼���
	//���������� Ŭ�����̸�(){} - ������ ����
	//�⺻������ : �Ű�����x, ���x
	//�����ڰ� �ٸ� �����ڸ� �������� ������ �����Ϸ� �ڵ����� ��������
	public ���() {}
	
	//������ �����ε�(�Ű����� �ٸ��� �ؼ� �ʿ��� �����ڸ� ������ �ۼ�)
	public ���(String name, int level, int power) {
		this.name = name;
		this.level = level;
		this.power = power;
	}
	
	
	
	//2. �ൿ(method) : �����Ѵ�, �ȴ´�
	public void attack() {
		System.out.println(name + " ����!");
	}
	public void walk() {
		System.out.println("�ȴ´�!");
	}
	
}
