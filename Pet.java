
/**
 * Creating class practice
 *
 * @author A. Zulch
 * @version 11.1.17
 */
public class Pet
{
    // instance variables - replace the example below with your own
    private String petName;
    private int collarNumber; // no capital letter because it could be confused with a class
    private boolean alive;
    public static int numPets;
    /**
     * Constructor for objects of class Pet
     */
    public Pet()
    {
        // initialise instance variables
        
    }
    public Pet(String nm, int num, boolean al) {
        this.petName = nm; // the this is optional but it helps make it more obvious
        this.collarNumber = num;
        this.alive = al;
        numPets++; // In constructor
    }
    public static void example() {
        System.out.println("This is static!"); //+ this.name doesn't compile inside parentheses //static means not tied to a particular object (can't be both)
    }
    //getter to get name/id
    public int getCollarNumber() {
        return this.collarNumber;
    }
    //setter so you can update it 
    public void setAlive(boolean al){
        this.alive = al;
    }
    //override method inherited by object class so it doesn't print memory location
    public String toString(){
        return "The pet's name is: " + this.petName;
        // when you print a variable, it references that to the string method
    }
}
