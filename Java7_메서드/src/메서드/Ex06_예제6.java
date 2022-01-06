package 메서드;

public class Ex06_예제6 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		// is메서드 -> 반환하는 타입이 boolean
		boolean result = isDivisor(num1, num2);
		System.out.println(result);
		
		// 출력하는 기능이 들어가있는 메서드를 만들자 -> void
		getDivisor(24);
		
		//getSumOfDivisor()메서드
		int num = 24;
		int result2 = getSumOfDivisor(num);
		//리턴타입 -> int
		System.out.println(num + "약수의 합 : " + result2);
		
		//isPerfectNumber
		// 완전수 => 자기자신을 제외한 약수들의 합이 자기자신과 같은 수
		// 6 -> 1+2+3+6 == 6 -> 완전수
		
		int num3 = 8128;
		boolean result3 = isPerfectNumber(num3);
		System.out.println("완전수? >> " + result3);
		
		int startNumber = 2;
		int endNumber = 1000;
		//2~1000사이의 완전수를 구하자
		getPerfectNumber(startNumber, endNumber);
		
		
	}
	public static boolean isDivisor(int num1, int num2) {
		boolean result = false;
		//만약, 다음의 조건을 만족한다면
		//num1을 num2로 나눴을 때 나누어 떨어지니?
		//num2가 num1의 약수니?
		//num1이 num2의 배수니?
		
		if(num1 % num2 == 0) {
			result = true;
		}
		return result;
	}
	public static void getDivisor(int num) {
		String result = "";
		result += num + "의 약수 : ";
		//이 result에 24의 약수 (1,2,3,4,6,8,12,24)
		
		for(int i = 1;i <= num;i++) {
			// i가 약수인지 아닌지
			// num%i==0 -> isDivisor
			if(isDivisor(num,i)) {
				result += i + " ";
			}
		}
		System.out.println(result);
		
	}
	public static int getSumOfDivisor(int num){

		int result2 = 0;
		
		for(int i = 1;i <= num;i++){
			if(isDivisor(num, i)){
				result2 += i;
			}		
		}
		return result2; 
	}
	public static boolean isPerfectNumber(int num3) {
		boolean result3 = false;
		//만약, num이 완전수라면 true를 리턴!
		//완전수란?
		//자기자신을 제외한 약수의 합이 자기자신과 같은것
		//완전수 여부를 판단하는 메서드를 만들어주세요
		
		if(getSumOfDivisor(num3)-num3 == num3) {
			return true;
		}
		
		return result3;
	}
	public static void getPerfectNumber(int startNumber, int endNumber){
		String result = "";
		result += startNumber+"~"+endNumber+"까지의 완전 수 : ";
	
		for (int i = startNumber; i <= endNumber; i++) {
			if(isPerfectNumber(i)){
				result += i + " ";
			}
		}
		System.out.println(result);
	}
}//end of class











