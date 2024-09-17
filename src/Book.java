public class Book {
    private String author;
    private String title;
    private boolean isAvailable;

    public Book(String author , String title , boolean isAvailable){
        this.author = author;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailability(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return title + "by " + author;
    }
}
