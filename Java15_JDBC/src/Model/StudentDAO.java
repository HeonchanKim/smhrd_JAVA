package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {
	//���1. ����ڰ� �Է��� ���� STUDENT ���̺� ���� (�л��߰�)
	public void insertStd(String name, int age, String tel, String email) {
		//JAVA - Oracle DB : JDBC java api
		
		try { //������ �ڵ�
			//1. Oracle JDBC driver �����ε�(�����Ҷ� ������ ���ڴ�!)
			//try ~ catch : ����ó���� �� �� ���
			
			//����1. �����Ͽ��� : �ڵ���ü�� Ʋ��(��Ÿ, �����̸�, ��������)
			//����2. ��Ÿ�ӿ��� : �ڵ尡 Ʋ������ �ƴ�, �������� �� ������ ���� ���
			//-> ��Ÿ�ӿ����� ���������� ������ �߻����� �� �� ���� -> ����ó���� �������
			
			//ClassNotFoundException �߻��� �� ����
			//1. ������Ʈ�� ojdbc ���̺귯���� �߰��Ͽ����� Ȯ��
			//2. ��ŸȮ��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			
			//2. ����� ���� ����, db ���� ��ü(Connection) ����
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//3. ������ sql��(String) ����
			//? : ���ε庯��
			//java�� �����ϴ� sql���� ��� auto commit : ��� sql�� �ڿ��� ; ������ �ȵ�!
			String sql = "INSERT INTO STUDENT VALUES(STDSEQ.nextval, ?, ?, ?, ?)";
			
			//4. sql���� �غ� ��ü(PreparedStatement) ����
			PreparedStatement pst = conn.prepareStatement(sql);
			
			//5. ���ε� ���� ä���
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setString(3, tel);
			pst.setString(4, email);
			
			
			
		//catch : try������ ���ܻ�Ȳ�� �߻��� ��� catch������ �����Ե�
		} catch (Exception e) { //ClassNotFoundException�� ó�� ����
			//Exception e -> ��� ���ܻ�Ȳ�� ó�� ����s
			//�߻��� ���ܻ�Ȳ�� �߻� ������� ���(��𿡼� ���ܻ�Ȳ�� �߻��߰�
			//���������� �߻��ߴ����� �ܼ�â���� ���� Ȯ��)
			e.printStackTrace();
		//finally : try������ ���ܻ�Ȳ�� �߻��ϴ���/�߻����� �ʴ��� �������� ������ ����
		//�ɼ�(�ᵵ �ǰ� �Ƚᵵ �ǰ�)
		}finally {
			
		}
		
		
	}
	
	
	
	
}
