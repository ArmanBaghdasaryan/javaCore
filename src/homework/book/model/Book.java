package homework.book.model;

public class Book {

    private String title;
    private Author author;
    private int count;
    private double price;
    private String genre;

    private User1 registeredUser;

    public Book(String title, Author author, int count, double price, String genre, User1 registeredUser) {
        this.title = title;
        this.author = author;
        this.count = count;
        this.price = price;
        this.genre = genre;
        this.registeredUser = registeredUser;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                "" + getAuthor() +
                ", count=" + count +
                ", price=" + price +
                ", registeredUser=" + registeredUser +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public User1 getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User1 registeredUser) {
        this.registeredUser = registeredUser;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}