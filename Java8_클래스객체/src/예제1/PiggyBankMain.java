package ����1;

public class PiggyBankMain {
	public static void main(String[] args) {

		PiggyBank pb = new PiggyBank();
		
		//private ���������� ���� �ʵ��
		//�ٷ� �������� ����! -> ����� ����ؼ� �� ����
		//pb.money = 10000000;
		
		pb.deposit(1000);
		pb.showMoney();
		System.out.println("===========================");
		pb.withdraw(600);
		pb.showMoney();
		System.out.println("===========================");
		pb.withdraw(1000);
		pb.showMoney();
		
	}
}
