public class DzieleniePrzezZeroTest {

    public static int dzielenie(int dzielna, int dzielnik){

        try {
            if(dzielnik == 0){
                throw new DzieleniePrzezZeroException();
            }
            int wynik = dzielna / dzielnik;
            return wynik;
        }
        catch (DzieleniePrzezZeroException e){
            System.err.println("Dzielenie przez zero!");
            return 0;
        }

    }

}
