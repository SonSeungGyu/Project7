package array.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		for (int i = 0; i < arr.length; i++) {
			if(i==0 || i==arr.length-1) {
				System.out.println(arr[i]);
			}
		}
	}
}
