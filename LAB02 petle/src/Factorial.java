public class Factorial {
    public static void calculateFactorial() {
        int[] numbers = new int[5];
        System.out.println("Podaj 5 liczb:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = Input.input_int();
        }


        for (int i = 0; i < 5; i++) {
            int number = numbers[i];
            long factorial = 1;

            for (int j = 1; j <= number; j++) {
                factorial *= j;
            }

            System.out.println("Silnia z " + number + " wynosi: " + factorial);


        }
    }
}