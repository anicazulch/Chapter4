
public class Library
{
    private String name;
    private Book[] books;
    /**
     * Constructor for objects of class Library
     */
    public Library(int size, String nm)
    {
        this.books = new Book[size];
        this.name = nm;
        
    }
    public String toString() {
        String output = "The library has: \n";
        for(Book b : books) {
            output += b + "\n";
        }
        return output;
        // good about for each loop is you don't go out of bounds
        // bad part is you don't know where you are in the list
    }
    
    public void addBook(Book b, int index) {
        books[index] = b;
    }
}
