package LinkedList.level1;

public class Movie {
    String title;
    double rating;
    int yearOfRelease;
    String director;
    Movie next;
    Movie prev;

    public Movie(String title, double rating, int yearOfRelease, String director) {
        this.title = title;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
        this.director = director;
        this.next = null;
        this.prev = null;
    }
}
