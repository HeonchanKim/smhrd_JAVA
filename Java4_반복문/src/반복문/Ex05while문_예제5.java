package �ݺ���;

import java.util.Scanner;

public class Ex05while��_����5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = ""; // String �ʱ�ȭ : null(�� - primitive type)
		String pw = "";
		String y_n = ""; // Y , N		
		int cnt = 0; //Ʋ��Ƚ�� ī����
		
		do {
			System.out.print("���̵� :");
			id = sc.next();
			System.out.print("��й�ȣ :");
			pw = sc.next();
			
			if(id.equals("smhrd") && pw.equals("1234")) {
				System.out.println("�α��� ����");
				//break; // �α��� ������ �ݺ��� ������!
			}else {
				System.out.println("�α��� ����");
				
				cnt++;
				
				if(cnt ==3) {
					System.out.println("���������� ���ּ���");
					break;
				}				
				System.out.println("��� �Ͻðڽ��ϱ�?");
				y_n = sc.next();
				if(y_n.equals("N") || y_n.equals("n")) {
					break;
				}
			}			
			
		}while(!id.equals("smhrd") || !pw.equals("1234"));
		// String ���� �񱳽� �������� �ʴ°�� : !(not)�� �񱳱��� �տ� �ۼ�
		
		
		
	}
}
