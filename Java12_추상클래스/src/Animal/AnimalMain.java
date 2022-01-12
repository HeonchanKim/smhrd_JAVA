package Animal;

import java.util.ArrayList;

public class AnimalMain {
	public static void main(String[] args) {

		Lion lion = new Lion();
		Rabbit rabbit = new Rabbit();
		
		//�߻�Ŭ������ ��ü ���� �Ұ���
		//�߻�Ŭ������ ��� �����޾� ����ϰ� ������ �Ǵ�
		//�߻�޼��带 ������ �������ؾߵȴٰ� ������ �ο� �Ҷ� ���
		//new Animal();
		
		lion.attack();
		rabbit.attack();
		
		Animal a1 = lion; //��ĳ���� : ����(��) -> ����(ū) => �ڵ�����ȯ
		Animal a2 = new Lion();
		Animal a3 = rabbit;
		
		ArrayList<Animal> al = new ArrayList<Animal>();
		al.add(a1);
		al.add(a3);
		al.add(new Lion());
		
		for(Animal a:al) {
			a.move();
		}
		
		//��ĳ������ �Ȱ�쿡�� ��� ����� ������ ���� ����
		//����Ŭ������ ������� ���� ����
		//��, ����Ŭ�������� �������̵� �� ��쿡�� ����Ŭ���� �޼��带 ȣ��
		//a1.sleep();
		//��ĳ���õ� ��ü�� �������·� �����ִ°� -> �ٿ�ĳ����(���������ȯ)
		Lion l = (Lion)a1;
		l.sleep();
		
		
		
		
		
	}
}
