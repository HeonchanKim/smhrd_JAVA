package EPoketmon;

public class Coil implements Epoketmon{
	@Override
	public void attack() {
		System.out.println("코일공격!");
	}

	@Override
	public void moving() {
		System.out.println("코일이동!");		
	}
}