package �迭�ǽ�;

import java.util.Scanner;

public class Ex08_ȸ������ {
	public static void main(String[] args) {
		
		// �Էµ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// id�� pw�� ����� ���� ����
		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		int num = 0;
		int cnt = 0;
		
		while(true) {
			System.out.print("[1]ȸ������ [2]�α��� [3]���� >> ");
			num = sc.nextInt();	
			
			if(num == 1) {
				
				// 3���� ȸ�������Ҽ��ֵ��� ������ ����
				// ȸ������Ƚ���� cnt�� �� ���ִ�
				while(cnt < 3) {
					System.out.println("==ȸ������==");
					System.out.print("���̵��Է�: ");
					id_array[cnt] = sc.next();
					System.out.print("��й�ȣ�Է�: ");
					pw_array[cnt] = sc.next();
					cnt++;
					
					System.out.println("���Լ���");
					break;
				}
				
			}else if(num == 2) {
				System.out.println("==�α���==");
				
				System.out.print("���̵��Է�: ");
				String id = sc.next();
				System.out.print("��й�ȣ�Է�: ");
				String pw = sc.next();
				
				// id�� pw �迭 �����ϱ� -> �Է��� id �� pw��
				// �迭�� �ִ��� Ȯ���ϱ� ���ؼ�
				for(int i = 0;i < id_array.length;i++) {
					for(int j = 0;j < pw_array.length;j++) {
						// .equals() -> ���ڰ� ������
						// == -> ���ں�
						if(id.equals(id_array[i]) && pw.equals(pw_array[j])) {
							if(i==j) {
								System.out.println("�α��� ����!");
								break;
							}
						}else {
							System.out.println("�α��� ����!");
							break;							
						}
						break;
					}
					break;
				}
			}else if(num == 3) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			
		}// end of while
		
		
		
		
		
		
		
	}
}
