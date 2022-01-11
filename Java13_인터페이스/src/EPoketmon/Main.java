package EPoketmon;

public class Main {
	public static void main(String[] args) {
		
		// Epoketmon e = new Epoketmon(); - 인터페이스를 객체 생성 불가능 
		
		Pikachu p = new Pikachu();
		Coil c = new Coil();
		
		Epoketmon e1 = p; // 업캐스팅(자동형변환)
		Epoketmon e2 = c;
		
		Epoketmon[] e_arr = new Epoketmon[2];
		
		//e_arr[0] = e1;
		e_arr[0] = p; //피카츄 -> 전기포켓못으로 업캐스팅(자동형변환)
		//e_arr[1] = e2; 
		e_arr[1] = c;
	}
}
