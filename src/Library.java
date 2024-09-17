import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();
    List<User> users = new ArrayList<>();
    public void addBook(String title , String author){
        Book book = new Book(author , title , true);
        books.add(book);
    }

    public boolean removeBook(String title){
        for(Book book : books){
            if (book.getTitle().equals(title)){ // check if the book is available
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    public void registerUser(String name , String id){
        User user = new User(name , id);
        users.add(user);
    }

    public String checkOutBook(String name, String title){
        for (User user : users){
            if(user.getName().equals(name)){ // check if the user has an account
                if (!user.isBorrowedBook()){ // check if the user has debt
                    for (Book book : books){
                        if (book.getTitle().equals(title) && book.isAvailable()) { // check if the book is in the library and also not taken
                            book.setAvailability(false);
                            user.setBorrowedBook(true);
                            return "the book has been checked out successfully";
                        }
                    }
                    return "the book is not available!";
                }
                return "you already took a book!";
            }
        }
        return "you have to make an account first";
    }

    public String ReturnBook(String name , String title , String author){
        for (User user : users){
            if(user.getName().equals(name)){ // check if the user has an account
                user.setBorrowedBook(false);
                addBook(title, author);
                return "the book is returned!";
            }
        }
        return "you have to make an account first";
    }
}
