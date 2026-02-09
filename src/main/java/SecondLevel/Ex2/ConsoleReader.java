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
            try {float input = sc.nextFloat(); return input;} catch (InputMismatchException e){
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
                return input;
            } catch(InputMismatchException e){
                System.out.println("Invalid type");
                sc.nextLine();
            }
        }
    }

//// Només accepta un únic caràcter. Si se n’introdueix més d’un, llença una excepció personalitzada.
//
//    public static String readString(String message);
//// Llegeix una cadena tal com es rep, però podries validar longitud mínima o contingut si cal.
//
//    public static boolean readYesNo(String message);
//// Si l’usuari/ària introdueix “s” (minúscula), retorna true. Si introdueix “n”, retorna false.
//// Qualsevol altra entrada hauria de generar una excepció personalitzada.
}
