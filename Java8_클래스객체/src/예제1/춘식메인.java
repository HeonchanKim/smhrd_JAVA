package 예제1;

public class 춘식메인 {
	public static void main(String[] args) {
		
		// 춘식 캐릭터(객체, 인스턴스) 생성
		new 춘식(); //춘식타입의 객체 생성
		
		//춘식 객체의 참조값을 저장하고 있는 레퍼런스 변수 선언
		춘식 cs = new 춘식();
		
		//현재 속성 출력
		
		//생성된 춘식 인스턴스의 레벨에 접근
		System.out.println(cs.level);
		
		//생성된 춘식 인스턴스의 공격 기능(메소드) 사용
		cs.attack();
		
		//춘식 인스턴스의 속성값 할당
		cs.name = "내 춘식이";
		cs.level = 20;
		cs.power = 50;
		
		System.out.println("이름 : "+cs.name);
		System.out.println("레벨 : "+cs.level);
		System.out.println("공격력 : "+cs.power);
		
		cs.attack();
		
		
		춘식 cs2 = new 춘식("춘식2", 10, 50);
		
		cs2.attack();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
