package 배열실습;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		int[] arr1 = new int[5]; // 사용자가 입력한 답을 저장
		int[] arr2 = {1,2,3,4,5}; // 실제 답
		int cnt = 0;
		
		for(int i = 0;i < arr1.length;i++ ) {
			System.out.printf("%d번째 답 >> ",i+1);
			arr1[i] = sc.nextInt();
		}
		System.out.println("정답확인");
		
		for(int i = 0;i < arr1.length;i++) {
			if(arr1[i] == arr2[i]) {
				System.out.print("O ");
				cnt++;
			}else {
				System.out.print("X ");				
			}
		}
		System.out.printf("총 점 : %d", cnt*20);
		
		
		
		
		
	} // end of main
}
