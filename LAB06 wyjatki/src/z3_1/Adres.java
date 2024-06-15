package z3_1;

public class Adres {

    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        if (ulica == null) {
            throw new NieprawidlowyAdresException("Ulica nie może być nullem.");
        }

        if (numerDomu <= 0) {
            throw new NieprawidlowyAdresException("Numer domu musi być liczbą większą od zera.");
        }

        if (kodPocztowy == null) {
            throw new NieprawidlowyAdresException("Kod pocztowy nie może być nullem.");
        }

        if (miasto == null) {
            throw new NieprawidlowyAdresException("Miasto nie może być nullem.");
        }

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }
}
