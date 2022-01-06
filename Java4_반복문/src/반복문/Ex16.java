package ¹Ýº¹¹®;

public class Ex16 {
	public static void main(String[] args) {
		
		int sum = 0;
		int up = 1;
		int down = 77;
		
//		for(int i = 77; i >= 1;i--) {
//			// System.out.println(i+"*"+(78-i));
//			sum += i*(78-i);
//		}
//		System.out.println(sum);

		for(int j = 1; j <= 77;j++) {
			sum += (78-j) * j;
		}
		System.out.println(sum);	
		
		
//		for(int k = 1; k <= 77;k++, down--, up++) {
//			sum += down*up;
//		}
//		System.out.println(sum);
		
		

		
		
	}
}
