package LinkedList.level1;

import java.util.Scanner;

public class MovieDoublyLinkedList {
	private Movie head = null;

    // 1. Add at the beginning
    public void addAtBeginning(String title, double rating, int yearOfRelease, String director) {
        Movie newMovie = new Movie(title, rating, yearOfRelease, director);
        newMovie.next = head;
        newMovie.prev = null;
        head = newMovie;
        System.out.println("Added at beginning.");
    }
    
 // 2. Add at the end
    public void addAtEnd(String title, double rating, int yearOfRelease, String director) {
        Movie newMovie = new Movie(title, rating, yearOfRelease, director);
        if (head == null) {
            head = newMovie;
        } else {
            Movie temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newMovie;
            newMovie.prev = temp;
        }
        System.out.println("Added at end.");
    }
 // 3. Add at specific position (1-based index)
    public void addAtPosition(int position, String title, double rating, int yearOfRelease, String director) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addAtBeginning(title, rating, yearOfRelease, director);
            return;
        }
        Movie newMovie = new Movie(title, rating, yearOfRelease, director);
        Movie temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newMovie.next = temp.next;
        temp.next = newMovie;
        newMovie.prev = temp;
        System.out.println("Added at position " + position + ".");
    }
    
 // 4. Delete by roll number
    public void deleteByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.title == title) {
            head = head.next;
            System.out.println("Deleted Movie with title: " + title);
            return;
        }
        Movie current = head;
        while (current.next != null && current.next.title != title) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Movie not found.");
        } else {
        	Movie temp = current.next.next;
            current.next = current.next.next;
            temp.prev = current;
            System.out.println("Deleted Movie with Title: " + title);
        }
    }
    
 // 5. Search by roll number
    public void searchByDirector(String directorName) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director == directorName) {
                System.out.println("Movie Found:");
                System.out.println("Director Name: " + temp.director);
                System.out.println("Movie Name: " + temp.title);
                System.out.println("Year of release: " + temp.yearOfRelease);
                System.out.println("rating: " + temp.rating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie with Director Name " + directorName + " not found.");
    }
    
 // 6. Update grade by roll number
    public void updateRating(String movieTitle, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title == movieTitle) {
                temp.rating = newRating;
                System.out.println("Updated Rating for Title " + movieTitle);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll Number not found.");
    }

    // 7. Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Movie temp = head;
        System.out.println("Movie Records:");
        while (temp != null) {
            System.out.println("---------------------------");
            System.out.println("Title: " + temp.title);
            System.out.println("Director: " + temp.director);
            System.out.println("Year Of Release: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            temp = temp.next;
        }
        System.out.println("---------------------------");
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMovie Records Menu:");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Position");
            System.out.println("4. Delete Movie by Title");
            System.out.println("5. Search Movie by Director");
            System.out.println("6. Update Rating");
            System.out.println("7. Display All Movies");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            int yearOfRelease, pos = 0;
            String title, director;
            double rating;

            switch (choice) {
                case 1:
                    System.out.print("Enter Movie Title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter Director Name: ");
                    director = scanner.nextLine();
                    System.out.print("Enter Year of Release: ");
                    yearOfRelease = scanner.nextInt();
                    System.out.print("Enter Rating: ");
                    rating = scanner.nextDouble();
                    list.addAtBeginning(title, rating, yearOfRelease, director);
                    break;
                case 2:
                	System.out.print("Enter Movie Title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter Director Name: ");
                    director = scanner.nextLine();
                    System.out.print("Enter Year of Release: ");
                    yearOfRelease = scanner.nextInt();
                    System.out.print("Enter Rating: ");
                    rating = scanner.nextDouble();
                    list.addAtEnd(title, rating, yearOfRelease, director);
                    break;
                case 3:
                	System.out.print("Enter Movie Title: ");
                    title = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter Director Name: ");
                    director = scanner.nextLine();
                    System.out.print("Enter Year of Release: ");
                    yearOfRelease = scanner.nextInt();
                    System.out.print("Enter Rating: ");
                    rating = scanner.nextDouble();
                    list.addAtPosition(pos,title, rating, yearOfRelease, director);
                    break;
                case 4:
                    System.out.print("Enter Movie Title to Delete: ");
                    title = scanner.nextLine();
                    list.deleteByTitle(title);
                    break;
                case 5:
                    System.out.print("Enter Director Name to Search: ");
                    director = scanner.nextLine();
                    list.searchByDirector(director);
                    break;
                case 6:
                    System.out.print("Enter Movie Title to Update : ");
                    title = scanner.nextLine();
                    System.out.print("Enter New Grade: ");
                    rating = scanner.next().charAt(0);
                    list.updateRating(title, rating);
                    break;
                case 7:
                    list.displayAll();
                    break;
                case 8:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();

	}

}
