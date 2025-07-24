package ScenarioBasedProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class LostAndFoundSystem {
	private Book head = null;
	
	public void addBook(String bookName, String author, String personName) {
		Book newBook = new Book(bookName, author, personName);
		if(head == null) {
			head = newBook;
		}else {
			Book temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newBook;
			
		}
	}
	
	public void removeBook(String bookName) {
		if(head == null) {
			return;
		}
		if(head.bookName == bookName) {
			head = head.next;
			return;
		}
		Book temp = head;
		while(temp.next.bookName != bookName) {
			temp = temp.next;
		}
		if (temp.next == null) {
            System.out.println("Book Not Found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Book Found" + bookName);
        }
	}
	
	public static void main(String[] args) {
		Book book = new Book(null, null, null);
		
		
		HashMap<String, LinkedList<String>> map = new HashMap<>();
		
	}

}
