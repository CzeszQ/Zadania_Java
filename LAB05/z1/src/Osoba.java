public class Osoba {
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba() {
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    private String imie="Jan",nazwisko="Nowak";

    int wiek=11;

    public void view(){
        System.out.println("imie "+imie+" nazwisko "+nazwisko+" wiek "+wiek);

    }
    private void private_method(){
        System.out.println("prywatna metoda");

        //final int liczba=12;
        //liczba=11;

    }
}
