package Toy;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachine extends Toy{
	//�ʵ� : arraylist, random
	//�޼��� : �峭���߰�, �����̱�
	ArrayList<Toy> toyList = new ArrayList<Toy>();
	Random rd = new Random();
	
	public void addToy(Toy toy) {
		toyList.add(toy); //������ �ӽ� �ν��Ͻ��� toyList �ʵ忡 �峭�� �߰�
	}
	
	public Toy getToy() {
		//0~2 �ε��� �� �������� �ϳ� ����
		int ran = rd.nextInt(toyList.size());
		return toyList.get(ran);
	}
	
}
