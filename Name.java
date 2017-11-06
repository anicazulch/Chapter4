// ****************************************************************
//   Name.java
// ****************************************************************
import java.util.Scanner;
public class Name
{
    //declare instance data
    private String first;
    private String middle;
    private String last;
    private int length;
    Scanner scan = new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Name(String first, String middle, String last)
    {
        //add body of constructor
    }
    public String getFirst() {
        return this.first;
    }
    public String getMiddle() {
        return this.middle;
    }
    public String getLast() {
        return this.last;
    }
    public String firstMiddleLast() {
        return "The person's full name is: " + this.first + this.middle + this.last;
    }
    public String lastFirstMiddle() {
        return "Another order of their name is: " + this.last + "," + this.first + this.middle;
    }
    public boolean equals(Name otherName){
        if(this.first.equalsIgnoreCase(otherName.first) && this.middle.equalsIgnoreCase(otherName.middle) && this.last.equalsIgnoreCase(otherName.last)){
            return true;
        }
        else{
            return false;
        }
    }
    public String initials(){
        return 
    }
    public int length(){
    }
}