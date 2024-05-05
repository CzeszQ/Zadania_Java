public class Random_even_sum {
    public static void  cast_lots_even_numbers() {

        System.out.println("podaj ilosc losowanych liczb: ");
        int n = Input.input_int();
        double even_sum=0;
        for (int i = 0; i < n; i++) {
            int numbers = Random_numbers.draw_lots(-10,45);
            System.out.println(numbers);
            if(numbers%2==0){
                even_sum+=numbers;
            }
        }
        System.out.println("Suma liczb parzystych"+even_sum);


    }


}
