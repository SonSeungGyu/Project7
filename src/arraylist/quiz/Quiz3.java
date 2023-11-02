package arraylist.quiz;

import java.util.ArrayList;

public class Quiz3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		for (String string : list) {
			System.out.println(string);
		}

		for (int i = 0; i < list.size(); i++) {
			list.remove(0);//list의 0번 요소를 삭제 했기에 list의 크기가 1씩 감소하게 될 것
			i--;//list의 사이즈가 1씩 감소하니 인덱스 값을 다시 0으로 만들어주고 이렇게 되면 list의 모든 요소는 remove 된다.
			
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		String str = list.get(0);
		System.out.println(str);
		
		
	}
}
