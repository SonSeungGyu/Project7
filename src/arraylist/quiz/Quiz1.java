package arraylist.quiz;

import java.util.ArrayList;

public class Quiz1 {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('B');
		list.add('C');
		
		for (Character character : list) {
			System.out.print(character + " ");
		}
	}
}
