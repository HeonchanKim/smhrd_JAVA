package Phone;

public class PhoneMain {
	public static void main(String[] args) {
		
		Phone p1 = new Phone();	
		FolderPhone p2 = new FolderPhone();
		SmartPhone p3 = new SmartPhone();
		
		p1.call();
		p2.call();
		
		//SmartPhone 클래스 call() 따로 정의하지 않았지만 Phone 클래스를
		//상속받는 것 만으로도 call()를 사용할 수 있음
		//SmartPhone call() -> "또로롱" -> 오버라이딩
		p3.call();
		
		//서브클래스에 작성된 메서드는 슈퍼클래스에서 사용 불가능
		//p1.internet();
		
		
		System.out.println(p1.getSpeaker());
		System.out.println(p3.getSpeaker());
		
		

	}
}
