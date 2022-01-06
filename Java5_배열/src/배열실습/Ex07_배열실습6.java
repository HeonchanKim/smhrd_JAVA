package 배열실습;

import java.util.Random;

public class Ex07_배열실습6 {
	public static void main(String[] args) {
		
		// 랜덤 숫자를 불러와주는 도구
		Random rd = new Random();
		
		System.out.println("====로또타임====");
		System.out.println("이번주 출력변호는요...!!두구두구두구!!!!");
		
		//5개의 랜덤 숫자를 저장할 수 있는 배열 생성
		int[] arr = new int[5];
		
		//중복값을 제거해야합니다.
		for(int i = 0;i < arr.length;i++) {
			// 0 ~ 10
			// 1 ~ 10
			arr[i]= rd.nextInt(9)+1;
			for(int j = 0; j < i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		//배열 출력
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
		
		
	}
}
