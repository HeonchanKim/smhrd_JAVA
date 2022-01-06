package 배열;

public class Ex01배열생성 {
	public static void main(String[] args) {
		
		// 1. 배열 생성
		// 2. 배열 레퍼런스 변수 선언 (배열의 참조값을 가짐)
		char[] c = new char[3]; // 메모리 공간상에 연속적인 3칸 공간 할당
		
		//3. 배열에 값 할당(각 인덱스에 접근)
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		
		//4. 배열 생성과 동시에 값 할당
		int[] i = {1, 5, 7, 3, 10}; // 자동으로 연속적인 5칸 공간 할당
		// 배열의 크기 변경 불가능!
		
		//5. 배열크기 출력(length 필드(속성) 활용)
		System.out.println("i 배열 크기 : " + i.length);
		
		System.out.println(i);
		System.out.println(c);
		
		
		int[] intArray = new int[5];
		int[] myArray = intArray;
		System.out.println("intArray 참조값 : " + intArray);
		System.out.println("myArray 참조값 : " + myArray);
		System.out.println(intArray[0]);
		
		intArray[1] = 2;
		System.out.println(intArray[1]);
		
		myArray[1] = 6;
		System.out.println(intArray[1]);
		
		
		
		
		
		
		
		
	}
}
