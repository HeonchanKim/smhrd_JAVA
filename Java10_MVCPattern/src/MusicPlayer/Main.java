package MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {
	public static void main(String[] args) {

		// �����÷��̾� �����!
		
		// �Է¹޴� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// Scanner, Random -> �ٸ�Ŭ�������� ��ɰ����ͼ� ���
		// MP3Player ����ϱ� ���� ��������ؾ�����!
		MP3Player mp3 = new MP3Player();
		
		//Controller �ȿ� ����� ����ϱ����� Ŭ���� ��������
		Controller con = new Controller();
		
		// Music Ŭ�����ȿ� �ִ� �����鿡�� �����͸� ���������
		//�뷡 5���� ���� �����ϱ�
		Music music1 = new Music("��", "Rain", 59, "C:\\Users\\smhrd\\Desktop\\music\\��.mp3");
		Music music2 = new Music("Maria", "ȭ��", 59, "C:\\Users\\smhrd\\Desktop\\music\\Maria.mp3");
		Music music3 = new Music("Mago", "�̸���", 59, "C:\\Users\\smhrd\\Desktop\\music\\MAGO.mp3");
		Music music4 = new Music("How you like that", "����ũ", 59, "C:\\Users\\smhrd\\Desktop\\music\\How you like that.mp3");
		Music music5 = new Music("��¦������", "�����̰�", 59, "C:\\Users\\smhrd\\Desktop\\music\\��¦������.mp3");
		
//		System.out.println(music1.getTitle());
//		System.out.println(music1.getSinger());
//		System.out.println(music1.getPlayTime());
		// �뷡������ ������ �����ϱ����ؼ� ArrayList
		
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);
		
		// "��" music1.getTitle() ----> list.get(0).getTitle()
		//System.out.println(list.get(0).getTitle());
		int index = 0;
		
		while(true) {
			// [1]��� [2]���� [3]������ [4]������ [5]���� >>>
			System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� >>> ");
			// ����ڿ� �Է¹��� ���� ����
			int menu = sc.nextInt();
			
			// 1,2,3,4�� �Է¹޾������� �ݺ�
			// 5�Է¹޾����� �ݺ� ����
			
			if(menu == 1) {
				//���
				System.out.println(list.get(index).getTitle());
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				
				//�뷡�� �����Ű�� ����� ǥ���� ��
				// mp3.play(list.get(index).getPath());
				//Controller���ִ� play�޼���(���)�� �ҷ����� ��
				con.play(list, index);
			}else if(menu == 2) {
				//����
				//�뷡�� ���ߴ� ���
				//�뷡�� ������϶��� ���ߴ� ��� ��밡��
				con.stop();
				
			}else if(menu == 3) {
				//������
				//1. �ε���
				index--;
				//2. �̹� �뷡�� ������̶�� �뷡�� �������
				con.stop();
				//3. �ε����� ���� 0���� ������ index ����(list.size()-1)
				if(index < 0) {
					index = list.size()-1;
				}
				System.out.println(list.get(index).getTitle());
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				//4. �뷡�� �����Ű��
				con.play(list, index);
				
				
			}else if(menu == 4) {
				//������
				
				//�ε��� + 1
				index++;
				//������ �ε��� ���ȿ� ����ִ� �뷡�� �����Ű��.
				//�뷡 �̹� ������̶�� �뷡�� ���߰� �����뷡 ���
				con.stop();
				
				//����2. list ũ�⸦ �Ѿ�� ó���뷡�� �ٽ� ���ƿͼ� ���
				if(index >= list.size() - 1) {
					index = 0;
				}
				System.out.println(list.get(index).getTitle());
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				con.play(list, index);
				
			}else if(menu == 5) {
				//����
				con.stop();
				
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		
		
	}
}
