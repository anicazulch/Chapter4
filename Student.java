// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private double test1;
    private double test2;
    private double average;
    Scanner scan = new Scanner(System.in); 
    
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //----------------------------------------------- 
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.println("Enter " + name + "'s score on the first test");
        test1 = scan.nextDouble();
        System.out.println("Enter " + name + "'s score on the second test");
        test2 = scan.nextDouble();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public double getAverage()
    {
        //add body of getAverage
        average = ((this.test1 + this.test2) / 2);
        return this.average;
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    public String getName(){
        //add body of getName
        return this.name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    public String printName()
    {
        //add body of printName
        return "The student's name is: " + this.name;
    }
    //toString method for the driver
    public String toString(){
        return "Name: " + this.name + " Test1: " + this.test1 + " Test2: " + this.test2;
        // when you print a variable, it references that to the string method
    }
}