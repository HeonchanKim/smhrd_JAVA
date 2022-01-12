
public class bikeMain {
	public static void main(String[] args) {

		Bike b1 = new Bike();
		
		b1.wheel = 2;
		b1.handle = "flat";
		b1.seatColor = "black";
		
		System.out.println("바퀴 수 : "+ b1.wheel);
		System.out.println("핸들 모양 : "+ b1.handle);
		System.out.println("안장 색상 : "+ b1.seatColor);
		
		b1.ride();
		b1.turn();

	}
}








2