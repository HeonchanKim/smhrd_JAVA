package 배열;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {

		//1.배열생성
		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		int cnt = 0;
		int cnt1 = 0;	
		
		System.out.print("array에 들어있는 홀수는 ");
		//2. 배열에서 홀수값만 출력
		for(int i = 0;i < arr.length;i++) {
			if(arr[i]%2==1){
				cnt++;
				System.out.print(arr[i]+" ");
			}else {
				//짝수
				cnt1++;
			}
		}
		System.out.println("이며, 총 " + cnt + "개 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
