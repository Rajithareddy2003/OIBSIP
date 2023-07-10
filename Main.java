import java.util.ArrayList;
import java.util.List;
class Book 
{
    private String title;
    private String author;
    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }
    public String getTitle() 
    {
        return title;
    }
    public String getAuthor() 
    {
        return author;
    }
    public String toString()
    {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + '}';
    }
}
class Library {
    private List<Book> books;
    public Library()
    {
        books = new ArrayList<>();
    }
    public void addBook(Book book) 
    {
        books.add(book);
    }
    public void removeBook(Book book) 
    {
        books.remove(book);
    }
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayBooks();
        library.removeBook(book2);
        library.displayBooks();
    }
}