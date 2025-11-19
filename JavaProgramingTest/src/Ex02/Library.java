package Ex02;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private static List<Book> bookList = new ArrayList<>();
	
	static {
		createBook("123123", "이게 자바냐", "감자바", "자바 감자바", 33000);
		createBook("112112", "정보처리기사", "김조은", "국가기술자격", 45000);
		createBook("001001", "실무 DB", "박디비", "디비디비딥", 60000);
	}
	
	public static Book createBook(String isbn,String title,String writer,String content,int price) {
		Book book = new Book(isbn, title, writer, content, price);
		bookList.add(book);
		return book;
	}
	
	public static List<Book> getBookList() {
		return bookList;
	}
	
	public static void main(String[] args) {
		
		System.out.println("########## 조은 스터디 도서관 ##########");
		for (Book string : bookList) {
			System.out.println(string);
		}
	}
	
}
