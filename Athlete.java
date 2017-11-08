public class Athlete
{
    private String name;
    private int age;
    
    public Athlete(String nm, int ag)
    {
        // initialise instance variables
        this.name = nm;
        this.age = ag;
    }
    public String toString(){
        return "This athlete's name is " + this.name + " and they are " + this.age + " years old.";
    }
    //inherited method coming from class Object
    public void setAge(int newAge){
        this.age = newAge;
        //called a setter or a mutator
    }
    public boolean equals(Athlete other){
        if(this.name.equals(other.name) && this.age == other.age){
            return true;
        }
        else{
            return false;
        }
    }
}
