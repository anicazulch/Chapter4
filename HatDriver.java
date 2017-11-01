public class HatDriver
{
    public static void main(String[] args) {
        Hat henry = new Hat("Floppy", true, 5);
        System.out.println(henry); // idNumber is a variable, not method.. no parentheses // variable sam hold location in memory --> print weird number
        henry.setOn(true);
    }
}
