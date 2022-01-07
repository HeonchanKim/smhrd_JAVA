package »ý¼ºÀÚ;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator(15, 5);
		System.out.println("num1 + num2 = " + cal.sum());
		
		cal.setNum1(75);
		cal.setNum2(5);
		System.out.println("num1 - num2 = " + cal.sub());
		System.out.println("num1 * num2 = " + cal.mul());
		System.out.println("num1 / num2 = " + cal.div());
	
	}
}
