package StdScore;

import java.util.Scanner;

public class StdScoreMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//StdScore ��ü �������� 3�� ������ �� �ִ� �迭 ����
		//���۷��� ���� ����
		StdScore[] stdScore_arr = new StdScore[3];
		int[] sum = new int[3];
		
		for (int i = 0; i < stdScore_arr.length; i++) {
			stdScore_arr[i] = new StdScore();
			System.out.print((i + 1) + "��° �л��� �̸��� �Է��ϼ���. >> ");
			stdScore_arr[i].setName(sc.next());
			System.out.print((i + 1) + "��° �л��� Java������ �Է��ϼ���. >> ");
			stdScore_arr[i].setScoreJava(sc.nextInt());
			System.out.print((i + 1) + "��° �л��� Web������ �Է��ϼ���. >> ");
			stdScore_arr[i].setScoreWeb(sc.nextInt());
			System.out.print((i + 1) + "��° �л��� Android������ �Է��ϼ���. >> ");
			stdScore_arr[i].setScoreAndroid(sc.nextInt());
			
			sum[i] = stdScore_arr[i].getScoreJava()+stdScore_arr[i].getScoreWeb()+stdScore_arr[i].getScoreAndroid();
			System.out.println();
		}
		
		for (int i = 0; i < stdScore_arr.length; i++) {
			System.out.println(stdScore_arr[i].getName()+"�� ������ "+sum[i]+"��, "+"����� "+(sum[i]/3)+"�� �Դϴ�.");			
		}
		
	}
}
