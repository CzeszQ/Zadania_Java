package z1_1;

import java.util.Scanner;

public class SquareRoot {
    public static void calculateAndDisplaySquareRoot() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj liczbę: ");
            String input = scanner.nextLine();
            double liczba = Double.parseDouble(input);

            if (liczba < 0) {
                throw new IllegalArgumentException("Liczba nie może być ujemna!");
            }
            double pierwiastek = Math.sqrt(liczba);
            System.out.println("Pierwiastek z liczby " + liczba + " wynosi: " + pierwiastek);
        } catch (NumberFormatException e) {
            System.err.println("Podany ciąg znaków nie jest liczbą.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }


}
