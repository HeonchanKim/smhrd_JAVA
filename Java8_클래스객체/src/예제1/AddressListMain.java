package ����1;

public class AddressListMain {
	public static void main(String[] args) {

		//��ü(�ν��Ͻ�) ����
		AddressList al = new AddressList();
		
		al.name = "������";
		al.address = "���ֱ����� ����";
		al.pNumber = "010-0000-0000";
		
		al.showAddr();
		
		System.out.println();
		
		AddressList al1 = new AddressList();
		
		al1.name = "������2";
		al1.address = "���ֱ����� ����2";
		al1.pNumber = "010-1111-1111";
		
		al1.showAddr();
	}
}
