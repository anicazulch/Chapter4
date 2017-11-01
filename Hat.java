
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat
{
    // instance variables - replace the example below with your own
    private String hatType;
    private boolean onHead;
    private int height;
    /**
     * Constructor for objects of class Pet
     */
    public Hat()
    {
        // initialise instance variables
        
    }
    public Hat(String nm, boolean on, int ht) {
        this.hatType = nm; // the this is optional but it helps make it more obvious
        this.onHead = on;
        this.height = ht;
    }
    //getter to get hat type
    public int getHeight() {
        return this.height;
    }
    //setter so you can update it 
    public void setOn(boolean on){
        this.onHead = on;
    }
    //override method inherited by object class so it doesn't print memory location
    public String toString(){
        return "The type of hat is: " + this.hatType;
        // when you print a variable, it references that to the string method
    }
}
