package array;

/*
	
*/

public class Ex06 {
	public static void main(String[] args) {
		char[] srcArr = {'a','b','c','d','e'};
		char[] newArr = new char[3];
		System.arraycopy(srcArr, 0, newArr, 0, 3);//(원본배열,시작위치,새배열,시작위치,개수)
		
		System.out.print("원본배열 : ");
		for (int i = 0; i < srcArr.length; i++) {
			System.out.print(srcArr[i] + " ");
			
		}
		System.out.println();
		System.out.print("새로운배열 : ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		
	}
}
