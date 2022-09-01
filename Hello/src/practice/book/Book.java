package practice.book;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	private static int countOfBooks = 0;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = ++countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public abstract int getLateFee(int lateDays);
	

	public boolean equals(Object o) {      //Object : 상속관계 최상위 클래스 , 명시하지 않더라도 Object가 자동으로 상속됨, Object보다 하위 타입은 다 들어올 수 있음
		Book book = (Book) o; //Book타입으로 캐스팅해야 Book에 있는 것들을 가져와서 사용할 수 있음
		if (this.title.equals(book.title) && this.author.equals(book.author)) {
//		if (this.title.equals((Book) o.title) && this.author.equals((Book) o.author)) {
			return true;
		}
		return false;

	}

	public int hashCode() {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("관리번호: %d번, 제목: %s, 작가: %s(일주일 연체료: %,d원) ", number, title, author, getLateFee(7));
	}
}
