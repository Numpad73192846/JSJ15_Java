package java_basic;

public class Notebook {
	String title;
	int pages;
	
	public Notebook(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}

	public void writePage() {
		pages += 1;
		System.out.println("페이지 작성!");
	}
	
	public void printInfo() {
		System.out.println(title + ", " + pages);
	}
	
	public static void main(String[] args) {
		Notebook notebook = new Notebook("str", 0);
		
		notebook.writePage();
		notebook.printInfo();
	}
	
}
