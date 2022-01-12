package View_Controller;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================SMHRD학생관리프로그램=====================");
		
		while(true) {
			System.out.println("1.학생추가 2.전체명단조회 3.특정학생조회 4.학생정보수정 5.학생삭제 6.프로그램종료");
			System.out.print("메뉴 선택 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("등록할 학생의 정보를 입력하시오");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String tel = sc.next();
				System.out.print("이메일 : ");
				String email = sc.next();
				
			}else if(menu == 2) {
				System.out.println("2번선택");
			}else if(menu == 3) {
				System.out.println("3번선택");
			}else if(menu == 4) {
				System.out.println("4번선택");
			}else if(menu == 5) {
				System.out.println("5번선택");
			}else if(menu == 6) {
				System.out.println("종료되었습니다");
				break;
			}
		} // end of while
	}
}
