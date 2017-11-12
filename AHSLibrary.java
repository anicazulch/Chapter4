
public class AHSLibrary
{
    public static void main(String[] args) {
        Library ahs = new Library(10, "Acalanes");
        Author a = new Author("F. Scott Fitzgerald", 117);
        Book b = new Book (a, "The Great Gatsby");
        ahs.addBook(b, 0);
        
        Author au = new Author("Anna Mary", 17);
        Book bo = new Book (au, "Wow, I Simply Don't Know!");
        ahs.addBook(bo, 1);
        System.out.println(ahs);
        //Use the toString() method to print the library’s books
    }
}