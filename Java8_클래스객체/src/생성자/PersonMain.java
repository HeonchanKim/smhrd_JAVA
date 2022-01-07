package 생성자;

public class PersonMain {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("헌찬김", 17);
		
		person1.setName("김헌찬");
		person1.setAge(27);
		
		System.out.println("학생 이름 : " + person1.getName() + ", 나이 : " + person1.getAge());
		System.out.println("학생 이름 : " + person2.getName() + ", 나이 : " + person2.getAge());
	}
}
