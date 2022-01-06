package 연산자;

import java.util.Scanner;

public class Ex04산술연산자_예제10 {
	public static void main(String[] args) {
		
		//ctrl+shift+o : 전체 import
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력: ");
		int time = sc.nextInt();
		
		int hour = time/3600;
		int minute = time%3600/60;
		int second = time%60; //time%3600%60
		
		System.out.printf("%d시 %d분 %d초", hour, minute, second);
		
	}
}
