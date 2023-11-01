package array.quiz;

import java.util.Arrays;

public class Quiz7 {
	public static void main(String[] args) {
		char[] srcArr = {'a','b','c','d','e'};
		char[] cpArr = new char[2];
		
		System.arraycopy(srcArr, 3, cpArr, 0, 2);
		
		System.out.println(Arrays.toString(cpArr));
	}
}
