package Phone;

//상속 : class 클래스명 extends 상위클래스명
//-> 상위클래스를 상속받아서 새로운 클래스 작성
//-> 상위클래스의 필드/메서드를 현재 클래스에 따로 정의하지 않아도 사용할 수 있음
public class SmartPhone extends Phone {
	//필드(속성) : (스피커, 마이크) => phone, 카메라
	//메서드(기능) : (전화하다, 문자하다) => phone, 인터넷하다
	
	String camera;
	
	//SmartPhone이 생성이 될떄 speaker 필드 값을 초기화 (LG)
	public SmartPhone() {
		super("LG"); //슈퍼클래스의 생성자 호출
		//정의안하면 슈퍼클래스의 기본생성자호출
		
		super.message();
		this.message();
	}
	
	public void internet() {
		System.out.println("인터넷접속!");
	}
	
	public String getSpeaker() {
		//super: 부모멤버(필드, 메서드) 호출
		return super.getSpeaker();
	}
}
