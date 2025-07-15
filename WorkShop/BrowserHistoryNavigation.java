package WorkShop;

public class BrowserHistoryNavigation {
	class Node{
		String url;
		Node next;
		Node prev;
		
		public Node(String url) {
			this.url = url;
		}
	}
	
	private Node current;
	private Node currPage;
	
	
	public void addPage(String url) {
		Node newPage = new Node(url);
		if(current == null) {
			current = newPage;
			currPage = current;
			return;
		}
		Node temp = current;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newPage;
		newPage.prev = temp;
	}
	
	public void displayAll() {
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = current;
        System.out.println("Web Pages:");
        while (temp != null) {
            System.out.println("---------------------------");
            System.out.println("Web Url: " + temp.url);
            temp = temp.next;
        }
        System.out.println("---------------------------");
    }
	
	public void nextPage() {
		if(currPage == null || currPage.next == null) {
			System.out.println("There is no next page move backward or add new page");
			return;
		}
		currPage = currPage.next;
		System.out.println(currPage.prev.url +" -> "+currPage.url);
		System.out.println("Moved forward to: " + currPage.url);
	}
	
	public void prevPage() {
		if(currPage == null || currPage.prev == null) {
			System.out.println("Currently at Null");
			return;
		}
		currPage = currPage.prev;
		
	    System.out.println("Moved backward to: " + currPage.url);
	}
	
	public void currentPage() {
		System.out.println("Current Page: "+currPage.url);
	}
	
	
	
	
	public static void main(String[] args) {
		 BrowserHistoryNavigation browser = new BrowserHistoryNavigation();
		    browser.addPage("--google.com");
		    browser.addPage("--wikipedia.org");
		    browser.addPage("--stackoverflow.com");
		    browser.addPage("--openai.com");

		    browser.displayAll();

		    System.out.println("\nNavigating forward:");
		    browser.currPage = browser.current; 
		    browser.currentPage();
		    browser.nextPage(); 
		    browser.currentPage();
		    browser.nextPage(); 
		    browser.currentPage();

	
		    System.out.println("\nNavigating backward:");
		    browser.currentPage();
		    browser.prevPage();
		    browser.currentPage();
		    browser.prevPage();
		    browser.currentPage();
		    
	}

}
