package EPoketmon;

public class Main {
	public static void main(String[] args) {
		
		// Epoketmon e = new Epoketmon(); - �������̽��� ��ü ���� �Ұ��� 
		
		Pikachu p = new Pikachu();
		Coil c = new Coil();
		
		Epoketmon e1 = p; // ��ĳ����(�ڵ�����ȯ)
		Epoketmon e2 = c;
		
		Epoketmon[] e_arr = new Epoketmon[2];
		
		//e_arr[0] = e1;
		e_arr[0] = p; //��ī�� -> �������ϸ����� ��ĳ����(�ڵ�����ȯ)
		//e_arr[1] = e2; 
		e_arr[1] = c;
	}
}
