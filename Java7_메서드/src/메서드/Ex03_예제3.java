package 메서드;

public class Ex03_예제3 {
	public static void main(String[] args) {
		int[] arr = {1,3,7,2,8,9};
		
		arrayToString(arr);
	}

	public static void arrayToString(int[] a) {
		for(int i: a) {
			System.out.print(i + " ");
		}
		/*
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		*/
	}
}
