public class Even_numbers_sum {

    public static void add_even(){
        System.out.println("podaj długosc ciagu");
        int n = Input.input_int();
        System.out.println("podaj liczby ciągu");
        double even_sum=0;
        for (int i = 0; i < n; i++) {
            double numbers=Input.input_double();
            if(numbers%2==0){
                even_sum+=numbers;
            }
        }
        System.out.println("Suma liczb dodatnich ciągu"+even_sum);



    }










}
