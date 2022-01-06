package PlayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicLIst {
	public static void main(String[] args) {

		// 첫화면
		// [1] 노래조회 [2] 노래추가 [3] 노래삭제 [4]종료
		Scanner sc = new Scanner(System.in);
		int select = 0;
		int select2 = 0;
		int select3 = 0;
		String musicName = "";
		//뮤직 리스트가 담길 ArrayList 선언 -> musicList
		ArrayList<String> musicList = new ArrayList<String>();

		while(true) {
			System.out.print("[1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >> ");
			select = sc.nextInt();
			
			if(select==1) {
				
				// 노래 조회
				// get()사용해서 지금까지 저장되어있는 데이터를 불러와야함
				// 조건 1. 단 리스트에 데이터가없다면 "현재 재생목록이 없습니다" 출력
				System.out.println("======현재 재생 목록======");
				if(musicList.size() == 0) {
					System.out.println("현재 재생목록이 없습니다");
				}else {
					for (int i = 0; i < musicList.size(); i++) {
						System.out.printf("%d. %s \n", i+1, musicList.get(i));
					}// end of for
					System.out.println("======================");
				} // end of if
				
			}else if(select==2) {
				
				// 노래 추가 기능
				// 재생 목록을 먼저 보여주고
				System.out.println("======현재 재생 목록======");
				if(musicList.size() == 0) {
					System.out.println("현재 재생목록이 없습니다");
				}else {
					for (int i = 0; i < musicList.size(); i++) {
						System.out.printf("%d. %s\n", i+1, musicList.get(i));
					}// end of for
				}
				System.out.println("======================");
				// 어느 위치에 추가할 것인지 선택하기
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >>");
				select2 = sc.nextInt();
				
				if(select2 == 1) {
					// 마지막 위치에 노래 추가
					System.out.print("추가할 노래 입력 >> ");
					musicName = sc.next();
					musicList.add(musicName);
					System.out.println("추가가 완료되었습니다.");
				}else if(select2 == 2) {
					// 원하는 위치에 노래 추가
					System.out.print("추가할 노래 입력 >> ");
					musicName = sc.next();
					System.out.print("추가할 위치 입력 >> ");
					int location = sc.nextInt();
					//location 위치에 musicName이 들어감
					//사용자가 원하는 위치와 인덱스의 값을 일치 -> location - 1
					musicList.add(location - 1, musicName);
					System.out.println("추가가 완료되었습니다.");
				}
				
			}else if(select==3) {
				// 노래 삭제
				// 선택시 노래 재생목록이 출력되어야함
				// 노래 데이터가있다면 삭제방법을 선택할수 있는 화면 출력
				
				System.out.println("======현재 재생 목록======");
				if(musicList.size() == 0) {
					System.out.println("현재 재생목록이 없습니다");
				}else {
					// 노래 데이터가 있는 부분
					for (int i = 0; i < musicList.size(); i++) {
						System.out.printf("%d. %s\n", i+1, musicList.get(i));
					}// end of for
				}
				System.out.println("======================");
				// [1]선택삭제 [2]전체삭제
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				// 사용자한테 입력받을 번호 변수 선언
				select3 = sc.nextInt();
				// 1,2 판단 -> 조건문
				// 1-> remove, 2-> clear()
				
				if(select3 == 1) {
					System.out.print("삭제할 노래 선택 >> ");
					int removeNum = sc.nextInt();
					// 사용자가 삭제할 데이터 순서 = 인덱스-1
					musicList.remove(removeNum-1);
					System.out.println("노래가 삭제되었습니다.");
				}else if(select3 == 2) {
					musicList.clear();
					System.out.println("전체 리스트가 삭제되었습니다.");
				}
				
			}else if(select==4) {
				System.out.println("프로그램이 종료되었습니다");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다");
			}
		} // end of while
		
	} // end of main
}
