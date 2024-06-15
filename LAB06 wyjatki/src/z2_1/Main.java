package z2_1;
public class Main {
    public static void main(String[] args) {

        try {
            int liczba = 2;
            long Silnia = Factorial.countFactorial(liczba);
            System.out.println("Silnia z " + liczba + " wynosi: " + Silnia);
        } catch (BlednaWartoscDlaSilniException e) {
            System.err.println(e.getMessage());
        }
        //z3

    }


}