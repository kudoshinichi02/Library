public class User {
    private String name;
    private String id;
    private boolean borrowedBook = false;

    public User(String name , String id ){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean isBorrowedBook() {
        return borrowedBook;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBorrowedBook(boolean borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    @Override
    public String toString() {
        return "the student name is " + name + "and his id is " + id + "and his request of borrowing a book is " + isBorrowedBook();
    }
}
