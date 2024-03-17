import java.util.Random;
public class Random_numbers {

        public static int draw_lots(int a, int b) {
            Random random = new Random();
            int randomRange = b - a + 1;
            int randomNumber = random.nextInt(randomRange) + a;
            int liczba = randomNumber + random.nextInt(10) + 1;
            return liczba;

        }
    }



