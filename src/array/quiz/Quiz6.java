package array.quiz;

public class Quiz6 {
	public static void main(String[] args) {
		int[] arr = {5,20,100,30,77};
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 20) {
				System.out.println("배열의 요소중 값이 20인 인덱스 : " + i);
				continue;//arr 배열의 요소중에 20이 또 있을 경우
			}
		}
	}
}
