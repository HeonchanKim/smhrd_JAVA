package StdScore;

import java.util.Scanner;

public class StdScoreMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//StdScore 객체 참조값을 3개 저장할 수 있는 배열 생성
		//레퍼런스 변수 선언
		StdScore[] stdScore_arr = new StdScore[3];
		int[] sum = new int[3];
		
		for (int i = 0; i < stdScore_arr.length; i++) {
			stdScore_arr[i] = new StdScore();
			System.out.print((i + 1) + "번째 학생의 이름을 입력하세요. >> ");
			stdScore_arr[i].setName(sc.next());
			System.out.print((i + 1) + "번째 학생의 Java점수를 입력하세요. >> ");
			stdScore_arr[i].setScoreJava(sc.nextInt());
			System.out.print((i + 1) + "번째 학생의 Web점수를 입력하세요. >> ");
			stdScore_arr[i].setScoreWeb(sc.nextInt());
			System.out.print((i + 1) + "번째 학생의 Android점수를 입력하세요. >> ");
			stdScore_arr[i].setScoreAndroid(sc.nextInt());
			
			sum[i] = stdScore_arr[i].getScoreJava()+stdScore_arr[i].getScoreWeb()+stdScore_arr[i].getScoreAndroid();
			System.out.println();
		}
		
		for (int i = 0; i < stdScore_arr.length; i++) {
			System.out.println(stdScore_arr[i].getName()+"의 총점은 "+sum[i]+"점, "+"평균은 "+(sum[i]/3)+"점 입니다.");			
		}
		
	}
}
