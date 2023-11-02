package arraylist;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();//list 는 Book타입의 객체들의 참조변수
		
		list.add(new Book("태백산맥", "조정래"));//생성자 호출해서 객체를 만들고 객체의 주소를 list에 추가해준것
		list.add(new Book("데미안", "헤세"));
		list.add(new Book("어떻게 살래", "유시민"));
		
		System.out.println("=====일반 for======");
		for (int i = 0; i < list.size(); i++) {
			//객체의 주소값을 가지고 있는 list에서 get으로 i번지의 Book타입 인스턴스의 주소를 book(참조변수)에 저장.
			Book book = list.get(i);//list에는 주소값이 저장되어있음, get으로 주소값을 꺼내고 이를 book참조변수에 카피해주는 것.
			book.showBookInfo();
			
		}
		System.out.println("======람다식 for======");
		for (Book book : list) {//람다식에선 get을 이용해 list의 주소값을 꺼낼 필요가 없음 
			book.showBookInfo();
		}
		
	}
}

class Book{
	String bookName;
	String author;
	
	//생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
}
