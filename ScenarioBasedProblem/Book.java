package ScenarioBasedProblem;

class Book {
	String bookName;
	String author;
	String personName;
	Book next;
	
	public Book(String bookName, String author, String personName) {
		this.bookName = bookName;
		this.author = author;
		this.personName = personName;
		this.next = null;
	}
	

}
