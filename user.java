////o	Create a class named user ,its attubrites are name,semester,id and its functions are consider book  borrow books  when he borrow book you will add a book to borrow arraylist and return book when he return book you will remove boo k from borrow  user
//why cant i gave integer as an argument to a funct because it cant check integer of the particular object that i need to check book.getID().equals(argument (integer ))
import java.util.ArrayList;
import java.util.Scanner;
public class user  {

    private String name;
    private String id;
    private int semester;
    private ArrayList<Book> BorrowBook = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

   
    
    public void ConsiderBook()
    {
       
        Library books = new Library();
        System.out.println("Which book you want to borrow ? ");
        String Title = scanner.nextLine();
        
        for (int i = 0; i < books.BookList.size(); i++) {
            Book Book_get = books.BookList.get(i);
            if (Book_get.getTitle().equals(Title)) {
                BorrowBook.add(Book_get);
                
            }
            else
            {
                System.out.println("Book is not avalaible!");
            }

            
        }

        
            
    }


    
   
    public void  ReturnBook()
    {
        System.out.println("Which book you want to return ?");
        String title = scanner.nextLine();
        
        
       
        //titile by user checked with title of books in the borrowed arraylist titile by user matches the title of book in the borrowed arraylist than book is borrowed 

        for (int i = 0; i < BorrowBook.size(); i++) {
            Book book = BorrowBook.get(i);

            if (book.getTitle().equals(title)) {

                BorrowBook.remove(i);
                System.out.println("Thank you for returning the Book.I hope you Borrow this book again!");
                break;
            }
            else
            {
                System.out.println("You are returning the wrong book! :" + book.getTitle());

            }
           
            
        }


        

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public ArrayList<Book> getBorrowBook() {
        return BorrowBook;
    }

    public void setBorrowBook(ArrayList<Book> borrowBook) {
        BorrowBook = borrowBook;
    }

  


  
    }



