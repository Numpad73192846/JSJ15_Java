package java_mission.Index15;

import java.util.ArrayList;
import java.util.List;

class Book {
	
	String isbn;
	String title;
	String writer;
	String content;
	int price;
	
	public Book() {
	}

	public Book(String isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return isbn + "|" + title + "\t| " + writer + "\t| " + content + "\t| " + price;
	}
	
}

class Library {
	
	private static List<Book> bookList = new ArrayList<>();

	static {
		createBook("123123", "이게 자바냐", "감자바","자바 감자바", 33000);
		createBook("112112", "정보처리기사", "김휴먼","국가기술자격", 45000);
		createBook("001001", "실무 DB", "박디비","디비디비딥", 60000);
	}
	
	public static Book createBook(String isbn, String title, String writer, String content, int price) {
		Book book = new Book(isbn, title, writer, content, price);
		bookList.add(book);
		return book;
	}
	
	public static List<Book> getBookList() {
		return bookList;
	}
	
}

public class Main {
	
    public static void main(String[] args) {
    	System.out.println("=============== ALOHA 스터디 도서관 ===============");
    	Library.getBookList().stream()
    						 .forEach(System.out::println);
	}

}
