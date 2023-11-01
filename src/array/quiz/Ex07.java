package array.quiz;

public class Ex07 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		
		library[0]= new Book("태백","조");
		library[1]= new Book("데미안","헤세");
		library[2]= new Book("자바","유시민");
		library[3]= new Book("토지","경리");
		library[4]= new Book("왕자","페리");
		
//		for (int i = 0; i < library.length; i++) {
//			System.out.print(library[i] + " ");
//		}------------->//주소값을 출력
		
		for (int i = 0; i < library.length; i++) {
			library[i].showInfo();
		}
		
	}
}
class Book{
	String bookName;
	String author;
	
	public Book(String bookname, String author) {
		super();
		this.bookName = bookname;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	
}
