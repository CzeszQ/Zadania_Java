public class Main {
    public static void main(String[] args) {
        Species gatunek1 = new Species("Homo", "sapiens", 46, 23, "Człowiek");
        Species gatunek2 = new Species("Canis", "lupus", 78, 39, "Wilk");
        Species gatunek3 = new Species("Felis", "catus", 38, 19, "Kot domowy");

        gatunek1.view();
        gatunek2.view();
        gatunek3.view();

        Species klonGatunek2= gatunek2.clone_();
        System.out.println("\nKlon gatunku 2:");
        klonGatunek2.view();

    }
}