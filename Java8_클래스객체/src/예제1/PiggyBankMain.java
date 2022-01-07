package 예제1;

public class PiggyBankMain {
	public static void main(String[] args) {

		PiggyBank pb = new PiggyBank();
		
		//private 접근제한자 붙은 필드는
		//바로 접근하지 못함! -> 기능을 사용해서 값 변경
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
