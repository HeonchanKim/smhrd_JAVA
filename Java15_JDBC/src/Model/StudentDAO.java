package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO(Data Access Object) : �����ͺ��̽� ���� �۾��� �����ϴ� Ŭ����
//�����ͺ��̽� ����, (�Է�, ����, ����, ��ȸ)���� �۾��� �ϴ� Ŭ����
//CRUD(Create(�Է�), Read(��ȸ), Update(����), Delete(����))
public class StudentDAO {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	//DB ���� �޼���
	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			
			//2. ����� ���� ����, db ���� ��ü(Connection) ����
			conn = DriverManager.getConnection(url, user, password);			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//����� ��ü�� ��ȯ(����)
	public void close() {
		try {
			if(rs != null) {
				rs.close(); //selectStds(), selectOneStd()������ ����ϴ� ��ü				
							//ResultSet ��ü�� �����Ǿ������� ȣ�� ������ �޼���
			}
			if(pst != null) {
				pst.close();				
			}
			if(conn != null) {
				conn.close();				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//���1. ����ڰ� �Է��� ���� STUDENT ���̺� ���� (�л��߰�)
	public boolean insertStd(String name, int age, String tel, String email) {
		//JAVA - Oracle DB : JDBC java api
		
		boolean check = false;
		
		try { //������ �ڵ�
			//1. Oracle JDBC driver �����ε�(�����Ҷ� ������ ���ڴ�!)
			//try ~ catch : ����ó���� �� �� ���
			
			//����1. �����Ͽ��� : �ڵ���ü�� Ʋ��(��Ÿ, �����̸�, ��������)
			//����2. ��Ÿ�ӿ��� : �ڵ尡 Ʋ������ �ƴ�, �������� �� ������ ���� ���
			//-> ��Ÿ�ӿ����� ���������� ������ �߻����� �� �� ���� -> ����ó���� �������
			
			//ClassNotFoundException �߻��� �� ����
			//1. ������Ʈ�� ojdbc ���̺귯���� �߰��Ͽ����� Ȯ��
			//2. ��ŸȮ��
			connect();
			
			//3. ������ sql��(String) ����
			//? : ���ε庯��
			//java�� �����ϴ� sql���� ��� auto commit : ��� sql�� �ڿ��� ; ������ �ȵ�!
			String sql = "INSERT INTO STUDENT VALUES(STDSEQ.nextval, ?, ?, ?, ?)";
			
			//4. sql���� �غ� ��ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);
			
			//5. ���ε� ���� ä���
			//set()�޼��� ex) setString(), setInt()
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setString(3, tel);
			pst.setString(4, email);
			
			//6. sql�� �����Ͽ� ��� ó��
			//executeUpdate() : insert, delete, update -> table�� ��ȭ�� �Ͼ
			//��ȯŸ�� : int (-> table�󿡼� ��� ���� ������ �Ǿ������� ��ȯ) 
			// ������ ����� �Ͼ ��쿡�� �׻� 0���� ū ���� ��ȯ
			//excuteQuery() : select -> �˻� (table �� ��ȭ�� �Ͼ�� ����)
			//��ȯŸ�� : ResultSet ��ü
			
			int cnt = pst.executeUpdate();
			
			if(cnt>0) {//�߰� ����
				check = true;
			}else { //�߰� ���� 
				check = false;
			}
			
		//catch : try������ ���ܻ�Ȳ�� �߻��� ��� catch������ �����Ե�
		} catch (Exception e) { //ClassNotFoundException�� ó�� ����
			//Exception e -> ��� ���ܻ�Ȳ�� ó�� ����s
			//�߻��� ���ܻ�Ȳ�� �߻� ������� ���(��𿡼� ���ܻ�Ȳ�� �߻��߰�
			//���������� �߻��ߴ����� �ܼ�â���� ���� Ȯ��)
			e.printStackTrace(); // �����߿� ���
			System.out.println("������ �غ����Դϴ�");
		//finally : try������ ���ܻ�Ȳ�� �߻��ϴ���/�߻����� �ʴ��� �������� ������ ����
		//�ɼ�(�ᵵ �ǰ� �Ƚᵵ �ǰ�)
		}finally {
			//����� ��ü��(Connection, PreparedStatement) ������(��ȯ)
			//���� �� ����! : ������ ���� �ݴ��
			close();
		}
		return check;
	}//end of method
	
	public ArrayList<StudentVO> selectStds() {
		ArrayList<StudentVO> al = new ArrayList<StudentVO>();
		
		try {
			//1. jdbc ����̹� �����ε�
			connect();
			
			//3. ������ sql�� ����
			String sql = "SELECT * FROM STUDENT";
			
			//4. sql ���� �غ� ��ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);
			
			//5. sql���� �����ϰ� ��� ó��
			rs = pst.executeQuery();
			
			//STUDENT ���̺� ���� �о ���
			while(rs.next()) {
				
				int num = rs.getInt(1); //���� Ŀ���� ����Ű�� �ִ� ���� ù��° �÷����� �о���ڴ�!
				String name = rs.getString("NAME"); //�÷��̸��� ��ġ�ϰ� �ۼ�
				//String name = rs.getString(2);
				int age = rs.getInt("AGE");
				String phone = rs.getString("PHONE");
				String email = rs.getString("EMAIL");
				
				//������ �о�� ����� �ʱ�ȭ���� ������ StudentVO ��ü�� ��������
				//ArrayList�� �߰�
				al.add(new StudentVO(num, name, age, phone, email));
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//��ü��(Connection, PreparedStatement, ResultSet) ������
			close();
		}
		
		return al;
	}//end of insertStd
	
	public StudentVO selectOneStd(int num) {
		//selectStd ���� : ArrayList�� ���� �ʿ����!
		//sql�� ���� (������ �ʿ�! : �л���ȣ(����� �Է�)�� �˻�), insert����
		//��ȯŸ��, �Ű����� ����
		
		StudentVO vo = null;
		
		try {
			connect();
			
			String sql = "SELECT * FROM STUDENT WHERE NUM = ?";
			
			pst = conn.prepareStatement(sql);
			pst.setInt(1, num);
			rs = pst.executeQuery();
			
			//sql�� ����� where���������� Ư���� ��ȣ�� ���� �л��� �˻�
			//-> resultset �� �ش� ��ȣ�� table�� �����ϸ� �ִ� 1�� ���� �����͸� ����
			//�������� ������ ������ x
			if(rs.next()) {
				int get_num = rs.getInt("NUM"); //���� Ŀ���� ����Ű�� �ִ� ���� ù��° �÷����� �о���ڴ�!
				String name = rs.getString("NAME"); //�÷��̸��� ��ġ�ϰ� �ۼ�
				//String name = rs.getString(2);
				int age = rs.getInt("AGE");
				String phone = rs.getString("PHONE");
				String email = rs.getString("EMAIL");
				
				vo = new StudentVO(get_num, name, age, phone, email);	
			}else {
				vo = new StudentVO();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return vo;
	}// end of selectOneStd
	
	public boolean updatePhone(int num, String phone) {
		boolean check = false;
		
		try {
			//1. jdbc ����̹� ���� �ε�
			connect();
			
			String sql = "UPDATE STUDENT SET PHONE = ? WHERE NUM = ?";
			
			//4. sql���� �غ�ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);
			
			//5. ���ε� ���� ä���
			pst.setString(1, phone);
			pst.setInt(2, num);
			
			//6.sql�� ����, ���ó��
			//executeUpdate()��ȯ Ÿ�� int
			int cnt = pst.executeUpdate();
			
			if(cnt > 0) { // ������ �� ��쿡�� check�� true������ ����
				check = true;
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			close();
		}
		return check;
	} // end of update
	public boolean updateEmail(int num, String email) {
		boolean check = false;
		
		try {
			//1. jdbc ����̹� ���� �ε�
			connect();
			
			String sql = "UPDATE STUDENT SET EMAIL = ? WHERE NUM = ?";
			
			//4. sql���� �غ�ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);
			
			//5. ���ε� ���� ä���
			pst.setString(1, email);
			pst.setInt(2, num);
			
			//6.sql�� ����, ���ó��
			//executeUpdate()��ȯ Ÿ�� int
			int cnt = pst.executeUpdate();
			
			if(cnt > 0) { // ������ �� ��쿡�� check�� true������ ����
				check = true;
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			close();
		}
		return check;
	}
	
	public boolean deleteStd(int num) {
		boolean check = false;
		
		try {
			connect();
			
			String sql = "DELETE FROM STUDENT WHERE NUM = ?";
			
			//4.sql ���� �غ� ��ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);
			
			//5.���ε� ���� ä���
			pst.setInt(1, num);
			
			//6. sql�� �����ϰ� ���ó��
			int cnt = pst.executeUpdate();
			
			if(cnt > 0) {//����� ���� �Ǿ�����
				check = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return check;
	}// end of deleteStd
}// end of class