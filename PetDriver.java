public class PetDriver
{
    public static void main(String[] args) {
        Pet pat = new Pet("Pat", 714, true);
        System.out.println(pat); // idNumber is a variable, not method.. no parentheses // variable sam hold location in memory --> print weird number
        pat.setAlive(false);
        
        Pet.example();
        System.out.println ("Number of pets: " + Pet.numPets); // static variable because it's from the class name like Math.sqrt
        // static isn't tied to any instance variable of that class and a static variable that everything uses
        Pet sam = new Pet ("Sam", 1204, true);
    }
}
