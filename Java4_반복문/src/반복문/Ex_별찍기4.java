package 반복문;

public class Ex_별찍기4 {
	public static void main(String[] args) {

		//     *
		//    **
		//  ****
		// *****
		//******
		
		for(int k = 1; k <= 5; k++) {
			for(int i = 4; i >= k; i--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}
