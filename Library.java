 
//challanges : who is borrowing books?id name semester university 
// why he is borrowing this books -its rating its good take comments while he is returning the book funct to show comments so user can decide he want to brrow book or not 
//how to sort students mangement system attendense students
import java.util.ArrayList;
import java.util.Scanner;
public class Library  {
    ArrayList<Book> BookList = new ArrayList<>();

   

    
    Scanner scanner = new Scanner(System.in);
    public void AddBook()
    {
        System.out.println("Which Book you want to Add in the Library ?");
        System.out.println("Title ? ");
        String Title = scanner.nextLine();
        System.out.println("Author ? ");
        String author = scanner.nextLine();
        System.out.println("ISBN ?");
        String ISBN = scanner.nextLine();
        BookList.add(new Book(Title, author, ISBN));

        System.out.println("Book added successfully!");
        


    


    }
    public void RemoveBook()
    {
        System.out.println("Which book you want to remove from the library? Enter its ISBN? ");
        String ISBN = scanner.nextLine();
        for (int i = 0; i < BookList.size(); i++) {
            Book book = BookList.get(i);

            if (book.getISBN().equals(ISBN)) {
                BookList.remove(i);
                System.out.println("Book removed Successfully!");
                
            }
            else
            {
                System.out.println("Book not Found!");
            }
            
        }


        

    }
    public void  SearchBook()
    {
        System.out.println("Which book you want to Search from the library? Enter its ISBN? ");
        String ISBN = scanner.nextLine();
        for (int i = 0; i < BookList.size(); i++) {
            Book book = BookList.get(i);

            if (book.getISBN().equals(ISBN)) {
                
                System.out.println("Book Found ! :" );
                //typeconvert
                
                System.out.println( "Title :" + book.getTitle());
                System.out.println( "Author : " + book.getAuthor());
                System.out.println( "ISBN  : " + book.getISBN());
                

                
            }
            else
            {
                System.out.println("Book not Found!");
               
            }
            
            
        }

    }
    public void DisplayBook()
    {
        for (int i = 0; i < BookList.size(); i++) {
            Book book = BookList.get(i);
            // at 0 zero index,[title,author,isbn] store in book object and then book gettitle
            System.out.println("Book " + BookList.get(i) + " details :");
            System.out.println("The Title of the book is :" + book.getTitle());
            System.out.println("The Author of the book is :" + book.getAuthor());
            System.out.println("The ISBN of the book is :" + book.getISBN());
            

            
        }

    }
    public void library()
    {
        Library books = new Library();
        user User = new user();
        System.out.println("Welcome to Library! Feel free to perfrom any of the function you want !");

        System.out.println("1. Add the book");
        System.out.println("2. Remove the book");
        System.out.println("3. Search the book");
        System.out.println("4. Display the book");
        System.out.println("5. Borrow Book");
        System.out.println("6. Return Book");
        System.out.println("7. Close");
        int choice;

        do {
            System.out.println("Enter your choice :");
             choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Adding the books!");

                    books.AddBook();
                    break;
                case 2:
                    System.out.println("Removing the books!");
                    books.RemoveBook();
                    break;

                case 3:
                    System.out.println("Searching the books !");
                    books.SearchBook();
                    break;

                case 4:
                    System.out.println("Displaying Books details present in the library currently!");
                    books.DisplayBook();
                    break;
                case 5:
                    System.out.println("Borrowing the Books!");

                    User.ConsiderBook();
                    break;
                case 6:
                    System.out.println("Returning the Books!");
                    User.ReturnBook();
                    break;
                case 7:
                    System.out.println("Exiting..Thank you for using Library!");
                    break;

                default:
                    System.out.println("Invalid choice.please enter valid prompt!");

                    break;
            }

        } while (choice != 7);

    }


    
}
