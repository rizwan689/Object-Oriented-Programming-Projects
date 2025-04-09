//. Library Management System:
//•	Create classes:
//o	Book: Stores information about a book (title, author, ISBN, etc.)
//o	Create a class named user ,its attubrites are name,semester,id and its functions are consider book  borrow books  when he borrow book you will add a book to borrow arraylist and return book when he return book you will remove book from borrow arraylist.
//o	Library: Manages a collection of Book objects using an ArrayList.
//•	Functionality:
//o	Add books to the library
//o	Search for books by title, author, or ISBN
//o	Display information about all books
//o	Remove books from the library

/**
 * Book
 */
public class Book {

    private String title;
    private String author;
    private String ISBN;

    Book(String title,String author,String ISBN)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;

    }

    public void SetTitile(String title)
    {
        this.title = title;


    }

    String getTitle()
    {
        return title;

    }
    public void SetAuthor(String author)
    {
        this.author = author;
    }
    String getAuthor()
    {
        return author;
    }
    public void SetISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }
    String getISBN()
    {
        return ISBN;
    }
}

