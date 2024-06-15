import java.util.Random;
import java.util.Scanner;

public class Radom {

    private static int countExceptions = 0;
    public static void radomize(){
        Random random = new Random();

        while (countExceptions < 3) {
            int dzielna = random.nextInt(21) - 10; // Losowanie liczby z przedziału [-10, 10]
            int dzielnik = random.nextInt(21) - 10; // Losowanie liczby z przedziału [-10, 10]

            try {
                int wynik = dzielenie(dzielna, dzielnik);
                System.out.println("Wynik dzielenia " + dzielna + " przez " + dzielnik + " wynosi: " + wynik);
            } catch (ArithmeticException e) {
                System.err.println("Wyjątek: Dzielenie przez zero!");
                countExceptions++;
            }
        }
    }
    public static int dzielenie(int dzielna, int dzielnik) {
        if (dzielnik == 0) {
            throw new ArithmeticException("Dzielenie przez zero!");
        }
        return dzielna / dzielnik;
    }
}

