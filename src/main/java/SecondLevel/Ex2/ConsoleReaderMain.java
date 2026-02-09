package SecondLevel.Ex2;

public class ConsoleReaderMain {
    public static void main (String[] args){
    int age = ConsoleReader.readByte("Please tell your age");
        System.out.println(age);

        char initial = validateChar("Please type your initial");
        System.out.println(initial);

        String name = validateString("Please enter your name");
        System.out.println(name);
    }
    public static char validateChar(String message){
        while(true){
            try {
                return ConsoleReader.readChar(message);
            }
            catch (InvalidInputTypeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String validateString(String message){
        while(true) {
            try {return ConsoleReader.readString(message);
            } catch (InvalidInputTypeException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
