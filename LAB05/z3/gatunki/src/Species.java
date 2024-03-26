public class Species {

    private String rodzaj;
    private String gatunek;
    private int liczbaChromosomow2n;
    private int liczbaChromosomowX;
    private String opis;

    public Species(String rodzaj, String gatunek, int liczbaChromosomow2n, int liczbaChromosomowX, String opis) {
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        liczbaChromosomow2n = liczbaChromosomow2n;
        liczbaChromosomowX = liczbaChromosomowX;
        this.opis = opis;
    }

    public String fullName(){
        return rodzaj +" "+gatunek;
    }
    public int numberofChromosomesN() {
        return liczbaChromosomow2n / 2;
    }
    public void view(){
        System.out.println("Nazwa: "+fullName()+
                " Liczba chromosowmow 2n: "+numberofChromosomesN()+
                " Liczba chromosomow x: "+liczbaChromosomow2n+
                 "Opis: "+opis);
    }
    public Species clone_(){
        return new Species(rodzaj, gatunek, liczbaChromosomow2n, liczbaChromosomowX, opis);
    }
}
