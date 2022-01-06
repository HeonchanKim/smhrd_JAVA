package 배열실습;

import java.util.Scanner;

public class Ex08_회원가입 {
	public static void main(String[] args) {
		
		// 입력도구 불러오기
		Scanner sc = new Scanner(System.in);
		
		// id와 pw가 저장될 공간 생성
		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		int num = 0;
		int cnt = 0;
		
		while(true) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
			num = sc.nextInt();	
			
			if(num == 1) {
				
				// 3번만 회원가입할수있도록 조건을 설정
				// 회원가입횟수를 cnt로 알 수있다
				while(cnt < 3) {
					System.out.println("==회원가입==");
					System.out.print("아이디입력: ");
					id_array[cnt] = sc.next();
					System.out.print("비밀번호입력: ");
					pw_array[cnt] = sc.next();
					cnt++;
					
					System.out.println("가입성공");
					break;
				}
				
			}else if(num == 2) {
				System.out.println("==로그인==");
				
				System.out.print("아이디입력: ");
				String id = sc.next();
				System.out.print("비밀번호입력: ");
				String pw = sc.next();
				
				// id와 pw 배열 접근하기 -> 입력한 id 와 pw가
				// 배열에 있는지 확인하기 위해서
				for(int i = 0;i < id_array.length;i++) {
					for(int j = 0;j < pw_array.length;j++) {
						// .equals() -> 문자가 같은지
						// == -> 숫자비교
						if(id.equals(id_array[i]) && pw.equals(pw_array[j])) {
							if(i==j) {
								System.out.println("로그인 성공!");
								break;
							}
						}else {
							System.out.println("로그인 실패!");
							break;							
						}
						break;
					}
					break;
				}
			}else if(num == 3) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
		}// end of while
		
		
		
		
		
		
		
	}
}
