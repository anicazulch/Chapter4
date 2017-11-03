public class CarDriver
{
    public static void main(String[] args) {
        Car myCar = new Car("Ford", 2017);
        System.out.println(myCar); // idNumber is a variable, not method.. no parentheses // variable sam hold location in memory --> print weird number
        
        
        // static variable because it's from the class name like Math.sqrt
        // static isn't tied to any instance variable/particular object of that class and a static variable that everything uses
        Car yourCar = new Car ("Ford", 2017);
        System.out.println(myCar.equals(yourCar));
    }
}
                