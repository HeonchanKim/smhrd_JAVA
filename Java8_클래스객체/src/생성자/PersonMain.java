package ������;

public class PersonMain {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("������", 17);
		
		person1.setName("������");
		person1.setAge(27);
		
		System.out.println("�л� �̸� : " + person1.getName() + ", ���� : " + person1.getAge());
		System.out.println("�л� �̸� : " + person2.getName() + ", ���� : " + person2.getAge());
	}
}
