
public class Book
{
    // instance variables - replace the example below with your own
    private Author bookAuthor;
    private String title;
    /**
     * Constructor for objects of class Book
     */
    public Book(Author a, String tl)
    {
        // initialise instance variables
        this.bookAuthor = a;
        this.title = tl;
    }
    public String toString() {
        return "The author of " + this.title + " is " + bookAuthor;
    }
}
