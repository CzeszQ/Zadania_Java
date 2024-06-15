import java.util.InputMismatchException;
import java.util.Scanner;

public class WprowadzZKonsoli {
    private static Scanner scanner = new Scanner(System.in);
    public static int wprowadzInt() {
        int liczba = 0 ;
        try {

            System.out.println("podaj liczbe");
            String input = scanner.nextLine();
            liczba = Integer.parseInt(input);

        } catch (NumberFormatException e) {
            System.err.println("Podany ciąg znaków nie jest liczbą.");
        }
        return liczba;
    }
    public static char wprowadzchar() {
        char znak = '\0';
        try {

            System.out.println("podaj znak");
            String input = scanner.next();
             znak = input.charAt(0);
        } catch (InputMismatchException e) {
            System.err.println("podano wiecej niz jeden znak");
        }
        return znak;
    }
    public static long wprowadzlong() {
        long liczba = 0 ;
        try {

            System.out.println("podaj liczbe");
            String input = scanner.nextLine();
            liczba = Long.parseLong(input);

        } catch (NumberFormatException e) {
            System.err.println("Podany ciąg znaków nie jest liczbą.");
        }
        return liczba;
    }



}
