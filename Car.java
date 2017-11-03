
/**
 * Creating Car class
 *
 * @author A. Zulch
 * @version 11.1.17
 */
public class Car
{
    // instance variables - replace the example below with your own
    private String model;
    private int year; // no capital letter because it could be confused with a class
    /**
     * Constructor for objects of class Car
     */
   
    public Car(String md, int yr) {
        this.model = md; // the this is optional but it helps make it more obvious
        this.year = yr;
    }
    
    //getter to get name/id
    public int getYear() {
        return this.year;
    }
    //setter so you can update it 
    public Car newCar(Car other){
        Car temp = new Car(other.model, this.year);
        return temp;
    }
    //override method inherited by object class so it doesn't print memory location
    public String toString(){
        return "This is a " + model + " built in " + year;
        // when you print a variable, it references that to the string method
    }
    public boolean equals(Car otherCar) {
        if(this.model.equals(otherCar.model) && this.year == otherCar.year){
            return true;
        }
        else{
            return false;
        }
    }
}
