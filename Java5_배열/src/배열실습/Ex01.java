package 배열실습;

public class Ex01 {
	public static void main(String[] args) {

		// 배열을 만들어보자
		// String
		// 크기 5
		// 배열을 선언
		String[] snack ;
		// 배열 생성
		snack = new String[5];
		
		snack[0] = "홈런볼"; 
		snack[1] = "다이제"; 
		snack[2] = "민트초코파이"; 
		snack[3] = "꾀돌이"; 
		snack[4] = "아폴로"; 
		
		// 왜 크기가 5인가요?
		// snack 배열의크기와 snack2배열의 크기는 같다
		
		String[] snack2 = {"홈런볼", "다이제", "민트초코파이", "꾀돌이", "아폴로"};
		//다이제를 불러오고 싶을때 접근
		System.out.println(snack2[1]);
		
		
		
		
		
	}
}
