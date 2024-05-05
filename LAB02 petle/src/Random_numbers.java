import java.util.Random;
public class Random_numbers {

        public static int[] generate_random_array(int size, int a, int b) {
            int[] tab = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                tab[i]=random.nextInt(b-a +1)+b;
            }
            return tab;
        }
    }



