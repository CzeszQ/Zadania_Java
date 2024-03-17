public class Sum {
    public static void count_sum() {

        int i = 0;
        System.out.println("podaj 10 liczb: ");
        int negative_numbers_count = 0;
        int positive_numbers_count = 0;
        double negative_numbers_sum = 0;
        double positive_numbers_sum=0;
        while (i < 10) {
            double numbers=Input.input_double();
            i++;
            if (numbers > 0) {
                positive_numbers_sum += numbers;
                positive_numbers_count++;

            }
            else if (numbers<0) {
                negative_numbers_sum +=numbers;
                negative_numbers_count++;
            }

        }
        System.out.println("suma liczba dotatnich "+positive_numbers_sum+"  oraz ich ilosc "+positive_numbers_count);
        System.out.println("suma liczba ujemnych "+negative_numbers_sum+" oraz ich ilosc "+negative_numbers_count);
    }
}