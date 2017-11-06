
public class Author
{
    // instance variables - replace the example below with your own
    
    private String name;
    private int age;
    /**
     * Constructor for objects of class Author
     */
    public Author(String nm, int yr)
    {
        // initialise instance variables
        this.name = nm;
        this.age = yr;
    }
    public String toString() {
        return this.name + " who is " + this.age + " years old.";
    }
}
