
public class Count {
    public static void calculate_sum(){
        int[] tab = Random_numbers.generate_random_array(5,0,20);
        System.out.println("Tablica wygenerowana losowo:");
        Arrays_printing.print_array(tab);

        int sum =0;
        for (int i = 0; i <tab.length ; i++) {
            sum+=tab[i];
        }
        System.out.println(sum);

    }
    public static void calculate_average(){
        int[] array= Random_numbers.generate_random_array(5,10,20);
        int sum = 0;
        for (double num : array) {
            sum += num;
        }
         double result= sum / array.length;
        System.out.println(result);;
    }








}


