package arraylist.quiz;

import java.util.ArrayList;

public class Quiz2 {
	public static void main(String[] args) {
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		list.add(true);
		list.add(true);
		list.add(false);
		
		for (int i = 0; i < list.size(); i++) {
			if(i==0||i==list.size()-1) {
				System.out.println(list.get(i));
			}
		}
	}
}
