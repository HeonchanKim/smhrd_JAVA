package PlayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicLIst {
	public static void main(String[] args) {

		// ùȭ��
		// [1] �뷡��ȸ [2] �뷡�߰� [3] �뷡���� [4]����
		Scanner sc = new Scanner(System.in);
		int select = 0;
		int select2 = 0;
		int select3 = 0;
		String musicName = "";
		//���� ����Ʈ�� ��� ArrayList ���� -> musicList
		ArrayList<String> musicList = new ArrayList<String>();

		while(true) {
			System.out.print("[1]�뷡��ȸ [2]�뷡�߰� [3]�뷡���� [4]���� >> ");
			select = sc.nextInt();
			
			if(select==1) {
				
				// �뷡 ��ȸ
				// get()����ؼ� ���ݱ��� ����Ǿ��ִ� �����͸� �ҷ��;���
				// ���� 1. �� ����Ʈ�� �����Ͱ����ٸ� "���� �������� �����ϴ�" ���
				System.out.println("======���� ��� ���======");
				if(musicList.size() == 0) {
					System.out.println("���� �������� �����ϴ�");
				}else {
					for (int i = 0; i < musicList.size(); i++) {
						System.out.printf("%d. %s \n", i+1, musicList.get(i));
					}// end of for
					System.out.println("======================");
				} // end of if
				
			}else if(select==2) {
				
				// �뷡 �߰� ���
				// ��� ����� ���� �����ְ�
				System.out.println("======���� ��� ���======");
				if(musicList.size() == 0) {
					System.out.println("���� �������� �����ϴ�");
				}else {
					for (int i = 0; i < musicList.size(); i++) {
						System.out.printf("%d. %s\n", i+1, musicList.get(i));
					}// end of for
				}
				System.out.println("======================");
				// ��� ��ġ�� �߰��� ������ �����ϱ�
				System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰� >>");
				select2 = sc.nextInt();
				
				if(select2 == 1) {
					// ������ ��ġ�� �뷡 �߰�
					System.out.print("�߰��� �뷡 �Է� >> ");
					musicName = sc.next();
					musicList.add(musicName);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
				}else if(select2 == 2) {
					// ���ϴ� ��ġ�� �뷡 �߰�
					System.out.print("�߰��� �뷡 �Է� >> ");
					musicName = sc.next();
					System.out.print("�߰��� ��ġ �Է� >> ");
					int location = sc.nextInt();
					//location ��ġ�� musicName�� ��
					//����ڰ� ���ϴ� ��ġ�� �ε����� ���� ��ġ -> location - 1
					musicList.add(location - 1, musicName);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
				}
				
			}else if(select==3) {
				// �뷡 ����
				// ���ý� �뷡 �������� ��µǾ����
				// �뷡 �����Ͱ��ִٸ� ��������� �����Ҽ� �ִ� ȭ�� ���
				
				System.out.println("======���� ��� ���======");
				if(musicList.size() == 0) {
					System.out.println("���� �������� �����ϴ�");
				}else {
					// �뷡 �����Ͱ� �ִ� �κ�
					for (int i = 0; i < musicList.size(); i++) {
						System.out.printf("%d. %s\n", i+1, musicList.get(i));
					}// end of for
				}
				System.out.println("======================");
				// [1]���û��� [2]��ü����
				System.out.print("[1]���û��� [2]��ü���� >> ");
				// ��������� �Է¹��� ��ȣ ���� ����
				select3 = sc.nextInt();
				// 1,2 �Ǵ� -> ���ǹ�
				// 1-> remove, 2-> clear()
				
				if(select3 == 1) {
					System.out.print("������ �뷡 ���� >> ");
					int removeNum = sc.nextInt();
					// ����ڰ� ������ ������ ���� = �ε���-1
					musicList.remove(removeNum-1);
					System.out.println("�뷡�� �����Ǿ����ϴ�.");
				}else if(select3 == 2) {
					musicList.clear();
					System.out.println("��ü ����Ʈ�� �����Ǿ����ϴ�.");
				}
				
			}else if(select==4) {
				System.out.println("���α׷��� ����Ǿ����ϴ�");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		} // end of while
		
	} // end of main
}
