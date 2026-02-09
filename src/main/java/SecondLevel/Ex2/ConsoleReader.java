package SecondLevel.Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static final Scanner sc = new Scanner(System.in);

    public static byte readByte(String message){
        while (true) {
            System.out.println(message);
            try {
                byte b = sc.nextByte();
                sc.nextLine();
                return b;
            } catch (InputMismatchException e) {
                System.out.println("It is an invalid type" );
                sc.nextLine();
            }
        }
    }
    public static int readInt(String message){
        while (true){
            System.out.println(message);
            try {
                int input = sc.nextInt();
                sc.nextLine();
                return input;
            } catch (InputMismatchException e){
                System.out.println("It is an invalid type" );
                sc.nextLine();
            }
        }
    }

    public static float readFloat(String message){
        while (true) {
            System.out.println(message);
            try {float input = sc.nextFloat();                 sc.nextLine();
                return input;} catch (InputMismatchException e){
                System.out.println("Invalid type");
                sc.nextLine();
            }
        }
    }

    public static double readDouble(String message){
        while (true) {
            System.out.println(message);
            try {
                double input = sc.nextDouble();
                sc.nextLine();

                return input;
            } catch(InputMismatchException e){
                System.out.println("Invalid type");
                sc.nextLine();
            }
        }
    }
    public static char readChar(String message) throws InvalidInputTypeException {
            System.out.println(message);
            String input = sc.nextLine();
            if (input.length() != 1 ){
                throw new InvalidInputTypeException(input + " cannot be parsed into a char variable as it has more than one letter");
            } else if (Character.isDigit(input.charAt(0)) || input.isBlank()) {
                throw new InvalidInputTypeException(input + " cannot be parsed into a char variable as it is not a single letter");
            }
                return input.charAt(0);
    }

    public static String readString(String message) throws InvalidInputTypeException {
        System.out.println(message);
        String input = sc.nextLine();
        if (input.isBlank()) {
            throw new InvalidInputTypeException("The input can't be a blank space");
        } else if (input.length() < 2) {
            throw new InvalidInputTypeException("The input can't consist of 0 or 1 only letter");
        }
        return input;
    }

//    public static boolean readYesNo(String message);
//// Si l’usuari/ària introdueix “s” (minúscula), retorna true. Si introdueix “n”, retorna false.
//// Qualsevol altra entrada hauria de generar una excepció personalitzada.
}
