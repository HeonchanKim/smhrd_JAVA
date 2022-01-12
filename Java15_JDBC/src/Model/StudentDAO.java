package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {
	//기능1. 사용자가 입력한 값을 STUDENT 테이블에 삽입 (학생추가)
	public void insertStd(String name, int age, String tel, String email) {
		//JAVA - Oracle DB : JDBC java api
		
		try { //실행할 코드
			//1. Oracle JDBC driver 동적로딩(실행할때 가지고 오겠다!)
			//try ~ catch : 예외처리를 할 때 사용
			
			//오류1. 컴파일오류 : 코드자체가 틀림(오타, 변수이름, 구문오류)
			//오류2. 런타임오류 : 코드가 틀린것은 아님, 실행했을 때 오류가 나는 경우
			//-> 런타임오류는 실행전에는 오류가 발생할지 알 수 없음 -> 예외처리를 해줘야함
			
			//ClassNotFoundException 발생할 수 있음
			//1. 프로젝트에 ojdbc 라이브러리를 추가하였는지 확인
			//2. 오타확인
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			
			//2. 사용할 계정 선택, db 연결 객체(Connection) 생성
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//3. 실행할 sql문(String) 정의
			//? : 바인드변수
			//java로 실행하는 sql문은 모두 auto commit : 모든 sql문 뒤에는 ; 적으면 안됨!
			String sql = "INSERT INTO STUDENT VALUES(STDSEQ.nextval, ?, ?, ?, ?)";
			
			//4. sql구문 준비 객체(PreparedStatement) 생성
			PreparedStatement pst = conn.prepareStatement(sql);
			
			//5. 바인드 변수 채우기
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setString(3, tel);
			pst.setString(4, email);
			
			
			
		//catch : try내에서 예외상황이 발생한 경우 catch문으로 들어오게됨
		} catch (Exception e) { //ClassNotFoundException만 처리 가능
			//Exception e -> 모든 예외상황을 처리 가능s
			//발생한 예외상황을 발생 순서대로 출력(어디에서 예외상황이 발생했고
			//무엇때문에 발생했는지를 콘솔창에서 직접 확인)
			e.printStackTrace();
		//finally : try문에서 예외상황이 발생하던지/발생하지 않던지 마지막에 무조건 실행
		//옵션(써도 되고 안써도 되고)
		}finally {
			
		}
		
		
	}
	
	
	
	
}
