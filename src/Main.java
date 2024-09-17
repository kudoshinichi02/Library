import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Library myLibrary = new Library();

        while(true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Register user");
            System.out.println("4. Check Out Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1){  // adding a book
                System.out.println("please enter the following information to add your book :");
                System.out.println("Book title:");
                String title = input.nextLine();
                System.out.println("Book author:");
                String author = input.nextLine();
                myLibrary.addBook(title,author);
                System.out.println("your book is added successfully");
            }
            else if(choice == 2){ // removing a book
                System.out.println("please enter the book title to remove the damaged book ");
                System.out.println("Book title:");
                String title = input.nextLine();
                boolean remove = myLibrary.removeBook(title);
                if (remove) {
                    System.out.println("the book has been removed correctly");
                }
                else{
                    System.out.println("there is no such a book!");
                }

            }
            else if(choice == 3){ // adding a new user
                System.out.println("please enter the following information ");
                System.out.println("your name :");
                String name = input.nextLine();
                System.out.println("your neptun code :");
                String id = input.nextLine();
                myLibrary.registerUser(name , id);
                System.out.println("you have been registered successfully");
            }
            else if (choice == 4){ // checking out a book
                System.out.println("please enter the following information");
                System.out.println("your name :");
                String name = input.nextLine();
                System.out.println("the title of the book that you want to borrow:");
                String title = input.nextLine();
                String result = myLibrary.checkOutBook(name , title);
                System.out.println(result);

            } else if (choice == 5) {
                System.out.println("please enter the following information");
                System.out.println("your name :");
                String name = input.nextLine();
                System.out.println("the title of the book that you want to return:");
                String title = input.nextLine();
                System.out.println("the author of the book that you want to return:");
                String author = input.nextLine();
                String result = myLibrary.ReturnBook(name , title , author);
                System.out.println(result);
            }
            else if (choice == 6){
                System.out.println("Have a nice day !");
                break;
            }
        }

    }
}