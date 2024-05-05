import java.util.Arrays;
public class CompareArrays {
    public static void comapre() {
        String[] array1 = {"jabłko", "banan", "gruszka", "pomarańcza"};
        String[] array2 = {"jabłko", "banan", "gruszka", "pomarańcza"};
        boolean are_equal = Arrays.equals(array1, array2);

        if (are_equal) {
            System.out.println("Tablice są takie same.");
        } else {
            System.out.println("Tablice nie są takie same.");
        }


    }

}



