package EPoketmon;

public class Pikachu implements Epoketmon{

	@Override
	public void attack() {
		System.out.println("피카츄공격!");
	}

	@Override
	public void moving() {
		System.out.println("피카츄이동!");
	}
}