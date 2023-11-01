package array;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		//배열에서 꺼낸 값을 저장할 변수: 배열
		for (int i : arr) {
			System.out.print(i + " ");
		}//람다식 : 자바가 발전하면서 문법을 간소화 시켜줌.
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println(arr);
		System.out.println(Arrays.toString(arr)); // 배열의 전체 요소를 보고 싶을때
		
	}
}
