package 반복문;

import java.util.Scanner;

public class Ex_별찍기2 {
	public static void main(String[] args) {

		//*
		//**
		//***
		//****
		//*****
		
		Scanner sc = new Scanner(System.in);
		System.out.println("별은 몇층인가요>> ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num;i++) {
			for(int j = 1; j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}
