
public class StudentPractice
{
    // instance variables
    private String name;
    private int idNumber; // no capital letter because it could be confused with a class
    private StudentPractice bestFriend; 
    /**
     * Constructor for objects of class Student
     */
    public StudentPractice()
    {
        // initialise instance variables
        
    }
    public StudentPractice(int num, String nm) {
        this.idNumber = num; // the this is optional but it helps make it more obvious
        this.name = nm;
    }
    public int combineIDNumbers(){
        return this.idNumber + bestFriend.idNumber;
    }
    public StudentPractice newStudentPractice(StudentPractice other){
        StudentPractice temp = new StudentPractice(other.idNumber, this.name);
        return temp;
    }
    public int getID() {
        return this.idNumber;
    }
    //override method inherited by object class
    public String toString(){
        return "The student's name is: " + this.name;
        // when you print a variable, it references that to the string method
    }
}
