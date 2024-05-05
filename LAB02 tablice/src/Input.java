import java.util.Scanner;
public class Input {
    public static int input_int() {
        Scanner scanner= new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static double input_double() {
        Scanner scanner= new Scanner(System.in);
        double liczba = scanner.nextDouble();
        return liczba;
    }

    public static String input_string(){
        Scanner scanner = new Scanner(System.in);
        String line= scanner.nextLine();
        return line;

    }

}



