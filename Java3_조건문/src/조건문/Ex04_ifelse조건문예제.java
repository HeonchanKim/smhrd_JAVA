package 조건문;

import java.util.Scanner;

public class Ex04_ifelse조건문예제 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int javaScore = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int pythonScore = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int androidScore = sc.nextInt();
		
		int avg = (javaScore+pythonScore+androidScore)/3;
		
		if(avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
	}
}
