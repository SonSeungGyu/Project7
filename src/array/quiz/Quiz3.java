package array.quiz;

public class Quiz3 {
	public static void main(String[] args) {
		int[] arr = {10,15,20,25,30};
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		System.out.println("배열요소의 합 : " + result);
	}
}
