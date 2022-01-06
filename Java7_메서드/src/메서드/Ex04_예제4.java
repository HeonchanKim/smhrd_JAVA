package 메서드;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04_예제4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		int len = sc.nextInt();
		
		int[] arr = getArr(len);
		
		//toString형식 출력하면 [ ] 안에 출력
		System.out.println(Arrays.toString(arr));
		
		boolean sw = isDuplicate(arr);
		System.out.println("결과 : " + sw);
	}
	
	private static int[] getArr(int len) {
		Random rd = new Random();
		//사용자가 입력한 길이만큼의 배열 생성
		int[] arr = new int[len];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(20)+1;
		}
		
		return arr;
	} // end of getArr
	
	private static boolean isDuplicate(int[] arr) {
		// boolean sw = false;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1;j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					return true;
					//return 키워드는 만나게되면 
					//해당 값을 반환하고 메소드를 종료
				}
			}	
		}
		return false;
	}// end of isDuplicate
} // end of class
