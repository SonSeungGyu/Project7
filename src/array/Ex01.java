package array;

/*
	배열 선언하고 사용하기
*/

public class Ex01 {
	public static void main(String[] args) {
		//변수 3개를 사용해서 숫자 3개 저장.
		int num1;
		int num2;
		int num3;
		num1 = 10;
		num2 = 20;
		num3 = 30;
		//배열을 사용해서 숫자 3개 저장하기
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40;//에러가 남. runtime에러 발생 (실행을 해봐야 알 수 있는 에러) <-> compile에러는 문법을 확인해주고 오류가 있으면 발생
		
		
		int value = arr[1];
		System.out.println(value);
		
		int num = 10;
		int [] arr1 = new int[3];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = num;
			System.out.println(arr[i]);
			num+=10;
			
		}
	}
}
