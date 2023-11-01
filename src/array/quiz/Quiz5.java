package array.quiz;

public class Quiz5 {
	public static void main(String[] args) {
		int[] arr = { 5, 20, 100, 30, 77 };
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > result) {
				result = arr[i];
			}
		}
		System.out.println(result);
	}
}
