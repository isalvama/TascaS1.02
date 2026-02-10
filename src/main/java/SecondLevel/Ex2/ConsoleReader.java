package SecondLevel.Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static final Scanner SC = new Scanner(System.in);

    public static byte readByte(String message){
        while (true) {
            System.out.println(message);
            try {
                byte b = SC.nextByte();
                SC.nextLine();
                return b;
            } catch (InputMismatchException e) {
                System.out.println("It is an invalid type" );
                SC.nextLine();
            }
        }
    }
    public static int readInt(String message){
        while (true){
            System.out.println(message);
            try {
                int input = SC.nextInt();
                SC.nextLine();
                return input;
            } catch (InputMismatchException e){
                System.out.println("It is an invalid type" );
                SC.nextLine();
            }
        }
    }

    public static float readFloat(String message){
        while (true) {
            System.out.println(message);
            try {float input = SC.nextFloat();                 SC.nextLine();
                return input;} catch (InputMismatchException e){
                System.out.println("Invalid type");
                SC.nextLine();
            }
        }
    }

    public static double readDouble(String message){
        while (true) {
            System.out.println(message);
            try {
                double input = SC.nextDouble();
                SC.nextLine();

                return input;
            } catch(InputMismatchException e){
                System.out.println("Invalid type");
                SC.nextLine();
            }
        }
    }
    public static char readChar(String message) throws InvalidInputTypeException {
            System.out.println(message);
            String input = SC.nextLine();
            if (input.length() != 1 ){
                throw new InvalidInputTypeException(input + " cannot be parsed into a char variable as it has more than one letter");
            } else if (Character.isDigit(input.charAt(0)) || input.isBlank()) {
                throw new InvalidInputTypeException(input + " cannot be parsed into a char variable as it is not a single letter");
            }
                return input.charAt(0);
    }

    public static String readString(String message) throws InvalidInputTypeException {
        System.out.println(message);
        String input = SC.nextLine();
        if (input.isBlank()) {
            throw new InvalidInputTypeException("The input can't be a blank space");
        } else if (input.length() < 2) {
            throw new InvalidInputTypeException("The input can't consist of 0 or 1 only letter");
        }
        return input;
    }

    public static char readYesNo(String message) throws InvalidInputTypeException{
        System.out.println(message);
        String input = SC.nextLine();
        if (!input.equals("y") && !input.equals("n") ){
            throw new InvalidInputTypeException("Invalid input: the input entered should only be 'y' or 'n' letters");
        }
        return input.charAt(0);
    }
}
